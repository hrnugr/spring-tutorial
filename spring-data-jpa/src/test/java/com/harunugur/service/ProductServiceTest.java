package com.harunugur.service;

import com.harunugur.entity.Product;
import com.harunugur.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.math.BigDecimal;
import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void testCreate() {
        Product product = new Product();
        product.setName("Test-1");
        product.setAmount(new BigDecimal("90.187"));
        product.setCreateDate(Date.valueOf("2020-12-12"));
        Product productMock = mock(Product.class);
        when(productMock.getId()).thenReturn(1L);

        when(productRepository.save(ArgumentMatchers.any(Product.class))).thenReturn(product);

        Product result = productService.create(product);
        assertEquals(result.getName(), product.getName());
        //assertEquals(result.getId(), 1L);

    }
}
