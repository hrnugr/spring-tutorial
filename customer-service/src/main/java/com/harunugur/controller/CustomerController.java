package com.harunugur.controller;

import com.harunugur.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @RequestMapping(value = "/customer", method = RequestMethod.POST ,produces= MediaType.APPLICATION_JSON_VALUE)
    public Customer customer(@RequestBody Customer customer) {
        LOGGER.info("CustomerController@customer method started ... ");
        LOGGER.info("payload :  " + customer);
        customer.setFirstName(customer.getFirstName()+" -------------------");
        customer.setFirstName(customer.getLastName()+"  -------------------");
        LOGGER.info("CustomerController@customer method finished ... ");
        return customer;
    }

}
