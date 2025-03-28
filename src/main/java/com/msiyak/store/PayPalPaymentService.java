package com.msiyak.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("paypal")
public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal");
        System.out.println("Amount: "+amount);
    }
}
