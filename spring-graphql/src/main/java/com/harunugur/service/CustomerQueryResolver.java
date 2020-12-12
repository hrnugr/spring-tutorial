package com.harunugur.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.harunugur.models.Customer;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerQueryResolver implements GraphQLQueryResolver {

    static List<Customer>  customerList = new ArrayList<Customer>();

    static {
        customerList.add(new Customer(1L,"harun","ugur","ugur.harun@yandex.com",Date.valueOf("1992-10-10")));
        customerList.add(new Customer(2L,"rıdvan","dilmen","ridvan.dilmen@ntv.com.tr",Date.valueOf("1975-09-10")));
        customerList.add(new Customer(3L,"murat","kosova","morat.kosova@ntv.com.tr",Date.valueOf("1960-04-15")));
    }

    public List<Customer> getAllCustomers(){
        return customerList;
    }

    public Customer getCustomerById(Long id){
        return customerList.stream()
                .filter(customer -> customer.getId().equals(id))
                .findAny()
                .orElse(null);
    }
}
