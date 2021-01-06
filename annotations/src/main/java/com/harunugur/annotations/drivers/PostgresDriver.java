package com.harunugur.annotations.drivers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:postgres.properties")
public class PostgresDriver implements DataBaseDriver {

    @Value("${databaseName}")
    private String databaseName;
    @Value("${disableStatementPooling}")
    private String disableStatementPooling;

    @Override
    public String getDriverInfo() {
        return "[ Driver: Postgres " +
                ", databaseName: " + databaseName +
                ", disableStatementPooling: " + disableStatementPooling +
                " ]";
    }
}
