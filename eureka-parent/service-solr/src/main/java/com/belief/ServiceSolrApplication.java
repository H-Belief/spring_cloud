package com.belief;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SuppressWarnings("SpringBootApplicationSetup")
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
class ServiceSolrApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSolrApplication.class, args);
    }
}
