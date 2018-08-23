package com.belief;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceJpaApplication.class, args);
    }
}
