package com.designpatterns.strategy.service;

import com.designpatterns.strategy.service.strategy.EmailNotification;
import com.designpatterns.strategy.service.strategy.InstagramNotification;
import com.designpatterns.strategy.service.strategy.NotificationStrategy;
import com.designpatterns.strategy.service.strategy.WhatsappNotification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NotificationService {

    private static final Logger log = LoggerFactory.getLogger(NotificationService.class);

    Map<String, NotificationStrategy>  notificationStrategyMap = Map.of(
            "email", new EmailNotification(),
            "whatsapp", new WhatsappNotification(),
            "instagram", new InstagramNotification()
    );

    public void sendNotification(String channel, String destination, String message) {
        notificationStrategyMap.get(channel).sendNotification(destination, message);
    }
}
