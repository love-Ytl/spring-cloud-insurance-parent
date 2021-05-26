package com.mzx.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启服务注册与发现
public class WarrantyProviderApp8200 {
    public static void main(String[] args) {
        SpringApplication.run(WarrantyProviderApp8200.class,args);
    }
}
