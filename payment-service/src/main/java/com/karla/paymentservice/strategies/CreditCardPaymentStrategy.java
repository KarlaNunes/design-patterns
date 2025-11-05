package com.karla.paymentservice.strategies;

import org.springframework.stereotype.Component;

@Component("CREDIT_CARD")
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment(Double amount) {
        return "Credit Card Payment of " + amount + " processed";
    }
}
