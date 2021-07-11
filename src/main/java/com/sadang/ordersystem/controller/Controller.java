package com.sadang.ordersystem.controller;

import com.sadang.ordersystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final ProductService productService;

    @GetMapping("search")
    public ResponseEntity<?> searchResult(String input) {
        return productService.loadProduct(input);
    }
}
