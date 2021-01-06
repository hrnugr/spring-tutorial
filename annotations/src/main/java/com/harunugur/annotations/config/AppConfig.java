package com.harunugur.annotations.config;

import com.harunugur.annotations.drivers.DataBaseDriver;
import com.harunugur.annotations.drivers.OracleDriver;
import com.harunugur.annotations.drivers.PostgresDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com.harunugur.annotations")
@PropertySource("classpath:oracle.properties")
public class AppConfig {

    @Autowired
    Environment environment;

    @Bean
    DataBaseDriver oracleDriver() {
        OracleDriver oracleDriver = new OracleDriver();
        oracleDriver.setDriver(environment.getProperty("db.driver"));
        oracleDriver.setUrl(environment.getProperty("db.url"));
        oracleDriver.setPort(Integer.parseInt(environment.getProperty("db.port")));
        return oracleDriver;
    }

    @Bean
    DataBaseDriver postgresDriver() {
        return new PostgresDriver();
    }
}
