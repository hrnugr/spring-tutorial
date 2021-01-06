package com.harunugur.annotations;

import com.harunugur.annotations.config.AppConfig;
import com.harunugur.annotations.drivers.DataBaseDriver;
import com.harunugur.annotations.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class AnnotationsApplication {

    public static void main(String[] args) {

        AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        DataBaseDriver oracle = appContext.getBean("oracleDriver", DataBaseDriver.class);
        DataBaseDriver postgres = appContext.getBean("postgresDriver", DataBaseDriver.class);

        System.out.println("Oracle driver info:");
        System.out.println(oracle.getDriverInfo());

        System.out.println("Postgres driver info:");
        for (String s : Arrays.asList(postgres.getDriverInfo(), "UserService Information")) {
            System.out.println(s);
        }

        UserService userService = appContext.getBean(UserService.class);
        System.out.println(userService.getDriverInfo());

        appContext.close();
    }
}


