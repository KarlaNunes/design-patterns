package com.designpatterns.strategy.service.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhatsappNotification implements NotificationStrategy {
    private static final Logger log = LoggerFactory.getLogger(WhatsappNotification.class);

    @Override
    public void sendNotification(String destination, String message) {
        log.info("Notification {} sent to whatsapp {}", message, destination);
    }
}
