package com.pos.stock_management_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> checkRestockNotifications() {
        // Fetch products that need restocking from the repository
        List<Product> products = productRepository.findProductsToRestock();
        
        // Debugging output: print the fetched products to the console
        System.out.println("Restock products: " + products);  // This is now correct
        
        return products;
    }
}
