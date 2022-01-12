package com.mama100.lotteryweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * *
 * *@author   Moss
 * *2022/1/11
 **/
@EnableSwagger2
@Configuration
public class SwaggerConfig {
    // 接口版本号
    private final String version = "1.0";
    // 接口大标题
    private final String title = "SpringBoot示例工程";
    // 具体的描述
    private final String description = "API文档自动生成示例";
    // 服务说明url
    private final String termsOfServiceUrl = "http://www.mama100.com";
    // licence
    private final String license = "MIT";
    // licnce url
    private final String licenseUrl = "https://mit-license.org/";
    // 接口作者联系方式
    private final Contact contact = new Contact("moss", "https://github.com/zengmoss", "80502321@qq.com");

    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(buildApiInf())
                .select().build();
    }

    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder().title(title).termsOfServiceUrl(termsOfServiceUrl).description(description)
                .version(version).license(license).licenseUrl(licenseUrl).contact(contact).build();

    }

}
