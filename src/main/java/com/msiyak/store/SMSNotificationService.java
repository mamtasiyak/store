package com.msiyak.store;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService {
    @Override
    public void processNotifications(String message){
        System.out.println("SMS");
        System.out.println("Message: "+message);
    }
}
