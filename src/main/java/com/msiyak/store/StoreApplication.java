package com.msiyak.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var heavyResource = context.getBean(HeavyResource.class);
//		var orderService = context.getBean(OrderService.class);
//		orderService.placeOrder();
//		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//		var notificationService = context.getBean(NotificationManager.class);
//		notificationService.sendNotification();
	}
}
