package com.harunugur.service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.harunugur.exceptions.RecordNotFoundException;
import com.harunugur.models.Customer;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class CustomerQueryResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    static List<Customer>  customerList = new ArrayList<Customer>();

    static {
        customerList.add(new Customer(1L,"harun","ugur","ugur.harun@yandex.com", Date.valueOf("1992-10-10")));
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

    public Customer createCustomer(Long id, String name, String surname, String email, String birthDate){
        Customer customer = new Customer();
        customer.setId(id);
        customer.setBirthDate(Date.valueOf(birthDate));
        customer.setEmail(email);
        customer.setName(name);
        customer.setSurname(surname);
       getCustomerList().add(customer);

        return customer;
    }

    public String deleteCustomer(Long id) {

        if (getCustomerById(id) == null) {
            throw new RecordNotFoundException("Record Not Found");
        }

        getCustomerList().remove(id);

        return new String("Customer deleted.");
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        CustomerQueryResolver.customerList = customerList;
    }
}
