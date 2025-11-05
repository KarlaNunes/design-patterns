package com.karla.paymentservice.strategies;

import org.springframework.stereotype.Component;

@Component("PIX")
public class PixPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment(Double amount) {
        return "Pix Payment " + amount  + " processed";
    }
}
