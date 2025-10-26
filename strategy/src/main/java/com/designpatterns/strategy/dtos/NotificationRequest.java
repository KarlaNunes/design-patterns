package com.designpatterns.strategy.dtos;

public record NotificationRequest(String channel, String destination, String message) {
}
