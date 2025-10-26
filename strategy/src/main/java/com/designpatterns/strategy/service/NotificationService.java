package com.designpatterns.strategy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private static final Logger log = LoggerFactory.getLogger(NotificationService.class);

    public void sendNotification(String channel, String destination, String message) {
        if (channel.equals("email")) {
            log.info("Notification {} sent to email {}", message, destination);
        }

        if (channel.equals("whatsapp")) {
            log.info("Notification {} sent to whatsapp {}", message, destination);
        }

        if (channel.equals("instagram")) {
            log.info("Notification {} sent to instagram {}", message, destination);
        }
    }
}
