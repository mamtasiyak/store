package com.msiyak.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService{
    @Override
    public void processNotifications(String message){
        System.out.println("Email");
        System.out.println("Message: "+message);
    }
}
