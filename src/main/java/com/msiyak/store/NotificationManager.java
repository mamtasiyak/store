package com.msiyak.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final NotificationService notificationService;
    public NotificationManager(@Qualifier("sms") NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void sendNotification(){
        notificationService.processNotifications("This is a test");
    }
}
