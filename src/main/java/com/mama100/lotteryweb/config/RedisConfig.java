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
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
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
    public RedisTemplate<Object, Object> redisTemplate(LettuceConnectionFactory connectionFactory) {
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(connectionFactory);
        ObjectRedisSerializer objectRedisSerializer = new ObjectRedisSerializer();
        // key采用String的序列化方式
        redisTemplate.setKeySerializer(objectRedisSerializer);
        // hash的key也采用String的序列化方式
        redisTemplate.setHashKeySerializer(objectRedisSerializer);
        GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
        // hash的value序列化方式采用jackson
        redisTemplate.setHashValueSerializer(genericJackson2JsonRedisSerializer);
        redisTemplate.setValueSerializer(genericJackson2JsonRedisSerializer);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

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
                        .entryTtl(Duration.ofDays(60L)).disableKeyPrefix()).withInitialCacheConfigurations(builderCacheConfigurations()).build();
    }

    public Map<String, RedisCacheConfiguration> builderCacheConfigurations() {
        Map<String, RedisCacheConfiguration> cacheConfigurations = new HashMap<String, RedisCacheConfiguration>();
        for (Minute m : Minute.values()) {
            cacheConfigurations.put(m.name(),
                    RedisCacheConfiguration.defaultCacheConfig()
                            .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
                            .entryTtl(Duration.ofMinutes(m.getTime())).disableKeyPrefix());
        }
        for (HOUR h : HOUR.values()) {
            cacheConfigurations.put(h.name(),
                    RedisCacheConfiguration.defaultCacheConfig()
                            .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
                            .entryTtl(Duration.ofHours(h.getTime())).disableKeyPrefix());
        }
        for (DAY d : DAY.values()) {
            cacheConfigurations.put(d.name(),
                    RedisCacheConfiguration.defaultCacheConfig()
                            .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
                            .entryTtl(Duration.ofDays(d.getTime())).disableKeyPrefix());
        }
        return cacheConfigurations;
    }

    @Override
    @Bean
    public KeyGenerator keyGenerator() {
        return (Object target, Method method, Object... params) -> target.getClass().getName() + Constant.DOT + method.getName() + Constant.LEFT_BRACKET
                + Stream.of(params).map(m -> String.valueOf(m)).collect(Collectors.joining(Constant.COMMA))
                + Constant.RIGHT_BRACKET;

    }

    private enum Minute {
        ONE_MINUTE(1),
        TWO_MINUTE(2),
        THREE_MINUTE(3),
        FOUR_MINUTE(4),
        FIVE_MINUTE(5),
        SIX_MINUTE(6),
        SEVEN_MINUTE(7),
        EIGHT_MINUTE(8),
        NINE_MINUTE(9),
        TEN_MINUTE(10),
        ELEVEN_MINUTE(11),
        TWELVE_MINUTE(12),
        THIRTEEN_MINUTE(13),
        FOURTEEN_MINUTE(14),
        FIFTEEN_MINUTE(15),
        SIXTEEN_MINUTE(16),
        SEVENTEEN_MINUTE(17),
        EIGHTEEN_MINUTE(18),
        NINETEEN_MINUTE(19),
        TWENTY_MINUTE(20),
        TWENTY_ONE_MINUTE(21),
        TWENTY_TWO_MINUTE(22),
        TWENTY_THREE_MINUTE(23),
        TWENTY_FOUR_MINUTE(24),
        TWENTY_FIVE_MINUTE(25),
        TWENTY_SIX_MINUTE(26),
        TWENTY_SEVEN_MINUTE(27),
        TWENTY_EIGHT_MINUTE(28),
        TWENTY_NINE_MINUTE(29),
        THIRTY_MINUTE(30),
        THIRTY_ONE_MINUTE(31),
        THIRTY_TWO_MINUTE(32),
        THIRTY_THREE_MINUTE(33),
        THIRTY_FOUR_MINUTE(34),
        THIRTY_FIVE_MINUTE(35),
        THIRTY_SIX_MINUTE(36),
        THIRTY_SEVEN_MINUTE(37),
        THIRTY_EIGHT_MINUTE(38),
        THIRTY_NINE_MINUTE(39),
        FORTY_MINUTE(40),
        FORTY_ONE_MINUTE(41),
        FORTY_TWO_MINUTE(42),
        FORTY_THREE_MINUTE(43),
        FORTY_FOUR_MINUTE(44),
        FORTY_FIVE_MINUTE(45),
        FORTY_SIX_MINUTE(46),
        FORTY_SEVEN_MINUTE(47),
        FORTY_EIGHT_MINUTE(48),
        FORTY_NINE_MINUTE(49),
        FIFTY_MINUTE(50),
        FIFTY_ONE_MINUTE(51),
        FIFTY_TWO_MINUTE(52),
        FIFTY_THREE_MINUTE(53),
        FIFTY_FOUR_MINUTE(54),
        FIFTY_FIVE_MINUTE(55),
        FIFTY_SIX_MINUTE(56),
        FIFTY_SEVEN_MINUTE(57),
        FIFTY_EIGHT_MINUTE(58),
        FIFTY_NINE_MINUTE(59),
        SIXTY_MINUTE(60),
        SIXTY_ONE_MINUTE(61),
        SIXTY_TWO_MINUTE(62),
        SIXTY_THREE_MINUTE(63),
        SIXTY_FOUR_MINUTE(64),
        SIXTY_FIVE_MINUTE(65),
        SIXTY_SIX_MINUTE(66),
        SIXTY_SEVEN_MINUTE(67),
        SIXTY_EIGHT_MINUTE(68),
        SIXTY_NINE_MINUTE(69),
        SEVENTY_MINUTE(70),
        SEVENTY_ONE_MINUTE(71),
        SEVENTY_TWO_MINUTE(72),
        SEVENTY_THREE_MINUTE(73),
        SEVENTY_FOUR_MINUTE(74),
        SEVENTY_FIVE_MINUTE(75),
        SEVENTY_SIX_MINUTE(76),
        SEVENTY_SEVEN_MINUTE(77),
        SEVENTY_EIGHT_MINUTE(78),
        SEVENTY_NINE_MINUTE(79),
        EIGHTY_MINUTE(80),
        EIGHTY_ONE_MINUTE(81),
        EIGHTY_TWO_MINUTE(82),
        EIGHTY_THREE_MINUTE(83),
        EIGHTY_FOUR_MINUTE(84),
        EIGHTY_FIVE_MINUTE(85),
        EIGHTY_SIX_MINUTE(86),
        EIGHTY_SEVEN_MINUTE(87),
        EIGHTY_EIGHT_MINUTE(88),
        EIGHTY_NINE_MINUTE(89),
        NINETY_MINUTE(90),
        NINETY_ONE_MINUTE(91),
        NINETY_TWO_MINUTE(92),
        NINETY_THREE_MINUTE(93),
        NINETY_FOUR_MINUTE(94),
        NINETY_FIVE_MINUTE(95),
        NINETY_SIX_MINUTE(96),
        NINETY_SEVEN_MINUTE(97),
        NINETY_EIGHT_MINUTE(98),
        NINETY_NINE_MINUTE(99),
        HUNDRED_MINUTE(100);

        private final Integer time;

        Minute(Integer time) {
            this.time = time;
        }

        public Integer getTime() {
            return time;
        }
    }

    private enum HOUR {
        ONE_HOUR(1),
        TWO_HOUR(2),
        THREE_HOUR(3),
        FOUR_HOUR(4),
        FIVE_HOUR(5),
        SIX_HOUR(6),
        SEVEN_HOUR(7),
        EIGHT_HOUR(8),
        NINE_HOUR(9),
        TEN_HOUR(10),
        ELEVEN_HOUR(11),
        TWELVE_HOUR(12),
        THIRTEEN_HOUR(13),
        FOURTEEN_HOUR(14),
        FIFTEEN_HOUR(15),
        SIXTEEN_HOUR(16),
        SEVENTEEN_HOUR(17),
        EIGHTEEN_HOUR(18),
        NINETEEN_HOUR(19),
        TWENTY_HOUR(20),
        TWENTY_ONE_HOUR(21),
        TWENTY_TWO_HOUR(22),
        TWENTY_THREE_HOUR(23),
        TWENTY_FOUR_HOUR(24),
        TWENTY_FIVE_HOUR(25),
        TWENTY_SIX_HOUR(26),
        TWENTY_SEVEN_HOUR(27),
        TWENTY_EIGHT_HOUR(28),
        TWENTY_NINE_HOUR(29),
        THIRTY_HOUR(30),
        THIRTY_ONE_HOUR(31),
        THIRTY_TWO_HOUR(32),
        THIRTY_THREE_HOUR(33),
        THIRTY_FOUR_HOUR(34),
        THIRTY_FIVE_HOUR(35),
        THIRTY_SIX_HOUR(36),
        THIRTY_SEVEN_HOUR(37),
        THIRTY_EIGHT_HOUR(38),
        THIRTY_NINE_HOUR(39),
        FORTY_HOUR(40),
        FORTY_ONE_HOUR(41),
        FORTY_TWO_HOUR(42),
        FORTY_THREE_HOUR(43),
        FORTY_FOUR_HOUR(44),
        FORTY_FIVE_HOUR(45),
        FORTY_SIX_HOUR(46),
        FORTY_SEVEN_HOUR(47),
        FORTY_EIGHT_HOUR(48),
        FORTY_NINE_HOUR(49),
        FIFTY_HOUR(50);

        private Integer time;

        HOUR(Integer time) {
            this.time = time;
        }

        public Integer getTime() {
            return time;
        }
    }

    private enum DAY {
        ONE_DAY(1),
        TWO_DAY(2),
        THREE_DAY(3),
        FOUR_DAY(4),
        FIVE_DAY(5),
        SIX_DAY(6),
        SEVEN_DAY(7),
        EIGHT_DAY(8),
        NINE_DAY(9),
        TEN_DAY(10),
        ELEVEN_DAY(11),
        TWELVE_DAY(12),
        THIRTEEN_DAY(13),
        FOURTEEN_DAY(14),
        FIFTEEN_DAY(15),
        SIXTEEN_DAY(16),
        SEVENTEEN_DAY(17),
        EIGHTEEN_DAY(18),
        NINETEEN_DAY(19),
        TWENTY_DAY(20),
        TWENTY_ONE_DAY(21),
        TWENTY_TWO_DAY(22),
        TWENTY_THREE_DAY(23),
        TWENTY_FOUR_DAY(24),
        TWENTY_FIVE_DAY(25);

        private Integer time;

        DAY(Integer time) {
            this.time = time;
        }

        public Integer getTime() {
            return time;
        }
    }

    public static class ObjectRedisSerializer implements RedisSerializer<Object> {
        private final Charset charset;

        public ObjectRedisSerializer() {
            this(StandardCharsets.UTF_8);
        }

        public ObjectRedisSerializer(Charset charset) {
            Assert.notNull(charset, "Charset must not be null!");
            this.charset = charset;
        }
        @Override
        public String deserialize(@Nullable byte[] bytes) {
            return bytes == null ? null : new String(bytes, this.charset);
        }
        @Override
        public byte[] serialize(@Nullable Object str) {
            if(str == null){
                return null;
            }
            if(str instanceof String){
                return ((String)str).getBytes(this.charset);
            }

            return String.valueOf(str).getBytes(this.charset);
        }

        @Override
        public Class<?> getTargetType() {
            return String.class;
        }
    }
}
