package com.karla.paymentservice.service;

import com.karla.paymentservice.dtos.PaymentRequestDTO;
import com.karla.paymentservice.strategies.CreditCardPaymentStrategy;
import com.karla.paymentservice.strategies.PaypalPaymentStrategy;
import com.karla.paymentservice.strategies.PixPaymentStrategy;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(PaymentRequestDTO payment) {
        return switch (payment.method()){
            case "PAYPAL" -> new PaypalPaymentStrategy().processPayment(payment.amount());
            case "PIX"  -> new PixPaymentStrategy().processPayment(payment.amount());
            default -> new  CreditCardPaymentStrategy().processPayment(payment.amount());
        };
    }
}
