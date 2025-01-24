package com.pos.stock_management_service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByQuantityStockLessThanEqualAndRestockLevelGreaterThanEqual(int quantityStock, int restockLevel);
}