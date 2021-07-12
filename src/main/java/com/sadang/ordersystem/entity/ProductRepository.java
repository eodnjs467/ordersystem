package com.sadang.ordersystem.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from Product p where p.productName like ':search'")
    List<Product> findAllBySearch(String search);
}
