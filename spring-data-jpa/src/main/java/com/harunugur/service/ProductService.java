package com.harunugur.service;

import com.harunugur.entity.Product;
import com.harunugur.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product create(Product product){

        return productRepository.save(product);
    }
}
