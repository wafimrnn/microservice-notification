package com.pos.stock_management_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    // Custom query to compare QUANTITY_STOCK and RESTOCK_LEVEL
    @Query("SELECT p FROM Product p WHERE p.quantityStock <= p.restockLevel")
    List<Product> findProductsToRestock();
}
