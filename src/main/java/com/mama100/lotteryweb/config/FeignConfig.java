package com.mama100.lotteryweb.config;

import feign.Logger;
import feign.Request;
import feign.Response;
import feign.Util;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.io.IOException;


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
            if (log.isInfoEnabled()) {
                log.info(String.format(methodTag(configKey) + format, args));
            }
        }

        @Override
        protected void logRequest(String configKey, Logger.Level logLevel, Request request) {
            this.log(configKey, "---> %s %s HTTP/1.1", request.httpMethod().name(), request.url());
            String bodyText;
            if (request.body() != null) {
                bodyText = request.charset() != null ? new String(request.body(), request.charset()) : null;
                this.log(configKey, "%s", bodyText != null ? bodyText : "Binary data");
            }
        }

        @Override
        protected Response logAndRebufferResponse(String configKey, Logger.Level logLevel, Response response, long elapsedTime) throws IOException {
            String reason = response.reason() != null && logLevel.compareTo(Logger.Level.NONE) > 0 ? " " + response.reason() : "";
            int status = response.status();
            this.log(configKey, "<--- HTTP/1.1 %s%s (%sms)", status, reason, elapsedTime);

            if (response.body() != null && status != 204 && status != 205) {

                byte[] bodyData = Util.toByteArray(response.body().asInputStream());
                this.log(configKey, "%s", Util.decodeOrDefault(bodyData, Util.UTF_8, "Binary data"));

                return response.toBuilder().body(bodyData).build();
            }
            return response;
        }
    }
}
