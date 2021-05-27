package com.ytl.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WarrantyApp8100 {
    public static void main(String[] args) {
        SpringApplication.run(WarrantyApp8100.class,args);
    }
}
