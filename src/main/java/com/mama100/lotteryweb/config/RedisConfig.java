package com.mama100.lotteryweb.config;

import com.mama100.lotteryweb.util.Constant;
import lombok.extern.log4j.Log4j2;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * *
 * *@author   Moss
 * *2022/1/13
 **/
@EnableCaching
@Configuration
@Log4j2
public class RedisConfig extends CachingConfigurerSupport {

    @Bean
    @Override
    public CacheErrorHandler errorHandler() {
        return new CacheErrorHandler() {

            @Override
            public void handleCacheGetError(RuntimeException exception, Cache cache, Object key) {
                // TODO Auto-generated method stub
                log.error("获取key:[{}]缓存失败，因为{}", key, exception.getMessage(), exception);
            }

            @Override
            public void handleCachePutError(RuntimeException exception, Cache cache, Object key, Object value) {
                // TODO Auto-generated method stub
                log.error("保存key:[{}],value:[{}]缓存失败，因为{}", key, value, exception.getMessage(), exception);
            }

            @Override
            public void handleCacheEvictError(RuntimeException exception, Cache cache, Object key) {
                // TODO Auto-generated method stub
                log.error("删除key:[{}]缓存失败，因为{}", key, exception.getMessage(), exception);
            }

            @Override
            public void handleCacheClearError(RuntimeException exception, Cache cache) {
                // TODO Auto-generated method stub
                log.error("清空缓存失败,因为{}", exception.getMessage(), exception);

            }
        };
    }

    @Bean
    public CacheManager cacheManager(LettuceConnectionFactory connectionFactory) {
        return RedisCacheManager.builder(connectionFactory)
                .cacheDefaults(RedisCacheConfiguration.defaultCacheConfig()
                        .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
                        .entryTtl(Duration.ofMinutes(60L)).disableKeyPrefix()).build();
    }

    @Override
    @Bean
    public KeyGenerator keyGenerator() {
        return (Object target, Method method, Object... params) -> target.getClass().getName() + Constant.DOT + method.getName() + Constant.LEFT_BRACKET
                + Stream.of(params).map(m -> String.valueOf(m)).collect(Collectors.joining(Constant.COMMA))
                + Constant.RIGHT_BRACKET;

    }
}
