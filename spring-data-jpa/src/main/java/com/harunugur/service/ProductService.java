package com.harunugur.service;

import com.harunugur.entity.Product;
import com.harunugur.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product create(Product product) {

        return productRepository.save(product);
    }

    public Page<Product> getAllProducts(int page, int size) {
        Pageable pageable = createPageable(page, size);

        return productRepository.findAll(pageable);

    }

    private Pageable createPageable(int page, int size) {
        // Pageable pageable = PageRequest.of(page, size, Sort.by("id"));
        // Pageable pageable1 = PageRequest.of(page, size);
        Pageable pageable2 = PageRequest.of(page, size, Sort.Direction.DESC, "createDate");

        return pageable2;
    }

}
