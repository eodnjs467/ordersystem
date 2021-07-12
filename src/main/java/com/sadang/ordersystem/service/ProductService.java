package com.sadang.ordersystem.service;

import com.sadang.ordersystem.entity.Product;
import com.sadang.ordersystem.entity.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @Transactional
    public List<Product> loadProduct(String search) {
        return productRepository.findAllBySearch(search);
    }
}
