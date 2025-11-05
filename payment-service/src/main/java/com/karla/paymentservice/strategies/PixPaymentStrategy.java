package com.karla.paymentservice.strategies;

public class PixPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment(Double amount) {
        return "Pix Payment " + amount  + " processed";
    }
}
