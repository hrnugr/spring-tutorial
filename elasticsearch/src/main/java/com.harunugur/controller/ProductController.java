package com.harunugur.controller;

import com.harunugur.model.Product;
import com.harunugur.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostConstruct
    public void init(){
       Product p = new Product();
       p.setId("1");
       p.setProductName("abc");
       p.setType("T");
       repository.save(p);
    }


    @GetMapping("/products/{search}")
    public ResponseEntity<List<Product>> search(@PathVariable String search){
        List<Product> products = repository.findByProductNameLikeOrTypeLike(search, search);

        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
