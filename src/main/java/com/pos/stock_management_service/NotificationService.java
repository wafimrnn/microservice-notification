package com.pos.stock_management_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> checkRestockNotifications() {
        // Fetch products that need restocking
        System.out.println("Restock products: " + products);
        return productRepository.findProductsToRestock();
    }
}
