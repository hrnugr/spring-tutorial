package com.harunugur.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class HelloQueryResolver implements GraphQLQueryResolver {

    public String hello() {
        return "Hello GraphQL";
    }

    public String helloWithParameter(String name) {

        return "Hello ".concat(name);
    }
}

