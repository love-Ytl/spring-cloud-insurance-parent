package com.ytl.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "insurance-provider-user")
public class UserConsumerApp9001 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApp9001.class,args);
    }
}
