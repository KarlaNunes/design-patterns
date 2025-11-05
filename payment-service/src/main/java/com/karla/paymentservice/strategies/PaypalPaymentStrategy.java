package com.karla.paymentservice.strategies;

public class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment(Double amount) {
        return "PayPal Payment of " + amount + " processed";
    }
}
