package com.designpatterns.strategy.controller;

import com.designpatterns.strategy.dtos.NotificationRequest;
import com.designpatterns.strategy.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody NotificationRequest notification) {
        String channel = notification.channel();
        String destination = notification.destination();
        String message = notification.message();

        notificationService.sendNotification(channel, destination, message);

        return ResponseEntity.ok().build();
    }
}
