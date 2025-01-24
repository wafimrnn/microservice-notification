package com.pos.stock_management_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/api/notification")
    public List<Product> getRestockNotifications() {
        return notificationService.checkRestockNotifications();
    }
}