package com.microservice.product.service;

import com.microservice.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public Product createProduct(Product product);
    public List<Product> getAllProducts();
}
