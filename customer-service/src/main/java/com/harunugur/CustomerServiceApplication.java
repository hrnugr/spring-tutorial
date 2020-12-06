package com.harunugur;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class CustomerServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.debug("The Customer service is running........");
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
}
