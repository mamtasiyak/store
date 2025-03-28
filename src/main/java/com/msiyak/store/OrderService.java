package com.msiyak.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
    @PostConstruct //The name of the method doesn't matter but the annotation we apply to this method matters
    public void init(){
        System.out.println("OS Post Construct");
    }
    @PreDestroy
    public void cleanup(){
        System.out.println("OS PreDestroy");
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
