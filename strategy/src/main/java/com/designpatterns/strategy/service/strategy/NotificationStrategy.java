package com.designpatterns.strategy.service.strategy;

public interface NotificationStrategy {
    void sendNotification(String destination, String message);
}
