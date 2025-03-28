package com.msiyak.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Bydefault Spring creates and initializes all beans when our application starts, this is early/Eager Initialization
// In contrast to Early Initialization, we have lazy Initialization, Its an optimization technique we can use for creating objects until they are needed. Typically Objects that care costly to create, perhaps they use a lot of memory, in those cases we use Lazy initialization.
// In this class we add methods for creating beans
@Configuration
public class AppConfig {
    @Value("${payment-gateway}")
    private String paymentGateway;
    @Bean
    public PaymentService stripe(){ //Name of Bean should be a Noun, not a verb
        return new StripePaymentService();
    }
    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }
    @Bean //If we create this bean using lazy initialization then we need to add lazy annotation(@Lazy) here
    public OrderService orderService(){
        if(paymentGateway.equals("stripe"))
            return new OrderService(stripe());
        return new OrderService(paypal());
    }
}
