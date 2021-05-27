package com.ytl.insurance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2  //开启swagger2
public class SwaggerConfig {

    //配置swagger的bean实列
    @Bean
    public Docket docket(Environment environment){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("易铁林")
                .enable(true)
                .select()
//               RequestHandlerSelectors配置要扫描接口的方式
                //basePackage：指定要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.ytl.insurance.controller"))
                .build()
                ;
    }


    private ApiInfo apiInfo(){

        Contact contact = new Contact("易铁林", "", "2937112901@qqcom");
        return new ApiInfo("易铁林的文档",
                "bbbbb",
                "1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
