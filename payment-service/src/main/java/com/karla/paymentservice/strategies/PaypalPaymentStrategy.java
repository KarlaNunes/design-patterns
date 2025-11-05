package com.karla.paymentservice.strategies;

import org.springframework.stereotype.Component;

@Component("PAYPAL")
public class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment(Double amount) {
        return "PayPal Payment of " + amount + " processed";
    }
}
