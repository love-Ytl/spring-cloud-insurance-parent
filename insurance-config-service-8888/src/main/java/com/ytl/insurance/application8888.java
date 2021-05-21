package com.ytl.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class application8888 {
    public static void main(String[] args) {
        SpringApplication.run(application8888.class,args);
    }
}
