package com.mama100.lotteryweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

@ActiveProfiles("dev")
@SpringBootTest()
class LotteryWebApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("begin");
        new RestTemplate().getForObject("http://localhost:8020/o2o-web/test/hello",String.class);
        System.out.println("end");
    }

}
