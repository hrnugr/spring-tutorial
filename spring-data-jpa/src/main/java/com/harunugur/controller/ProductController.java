package com.harunugur.controller;

import com.harunugur.entity.Product;
import com.harunugur.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping
    public Page<Product> getAllProducts(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size){

        return productService.getAllProducts(page,size);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        Product product = productService.getProductById(id);

        return ResponseEntity.ok(product);
    }
}
