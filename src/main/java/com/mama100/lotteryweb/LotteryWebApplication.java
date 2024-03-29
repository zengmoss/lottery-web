package com.mama100.lotteryweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("com.mama100.lotteryweb.mapper")
public class LotteryWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LotteryWebApplication.class, args);
    }

}
