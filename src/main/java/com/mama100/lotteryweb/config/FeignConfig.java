package com.mama100.lotteryweb.config;

import feign.Logger;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(FeignConfig.FeignLogger.class)
public class FeignConfig {
	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

	@Log4j2
	public static class FeignLogger extends feign.Logger {
		@Override
		protected void log(String configKey, String format, Object... args) {
			if(log.isInfoEnabled()){
				log.info(String.format(methodTag(configKey) + format, args));
			}
		}
	}
}
