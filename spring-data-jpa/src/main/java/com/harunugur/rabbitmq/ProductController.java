package com.harunugur.rabbitmq;

import com.harunugur.entity.Product;
import com.harunugur.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(value = "/create")
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @GetMapping(value = "/all")
    public Page<Product> getAllProducts(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size){

        return productService.getAllProducts(page,size);
    }
}
