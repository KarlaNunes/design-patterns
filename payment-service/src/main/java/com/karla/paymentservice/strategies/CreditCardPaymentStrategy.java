package com.karla.paymentservice.strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment(Double amount) {
        return "Credit Card Payment of " + amount + " processed";
    }
}
