package com.sadang.ordersystem.controller;

import com.sadang.ordersystem.entity.Product;
import com.sadang.ordersystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class Controller {
    private final ProductService productService;

    @GetMapping("/search")
    public ResponseEntity<?> searchResult(@RequestBody String input) {
        System.out.println(input);
        List<Product> productList = productService.loadProduct(input);
        return productList.isEmpty() ?
                new ResponseEntity<>("검색결과가 없습니다.", HttpStatus.OK) :
                new ResponseEntity<>(productList, HttpStatus.OK);
    }
}
