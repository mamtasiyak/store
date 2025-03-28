package com.msiyak.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService  paymentService){
        this.paymentService = paymentService;
        System.out.println("Order Service Created");
    }
    public void placeOrder(){
        paymentService.processPayment(10);
    }
}
