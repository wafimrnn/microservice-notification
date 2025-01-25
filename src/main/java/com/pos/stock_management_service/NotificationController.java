package com.pos.stock_management_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;

@RestController
@CrossOrigin(origins = "https://kedaikerepekmaksu-h5a4bgdpdue2cnge.southeastasia-01.azurewebsites.net")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/api/notification")
    public List<Product> getRestockNotifications() {
        return notificationService.checkRestockNotifications();
    }
}
