package com.designpatterns.strategy.service.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotification implements NotificationStrategy{
    private static final Logger log = LoggerFactory.getLogger(EmailNotification.class);

    @Override
    public void sendNotification(String destination, String message) {
        log.info("Notification {} sent to email {}", message, destination);
    }
}
