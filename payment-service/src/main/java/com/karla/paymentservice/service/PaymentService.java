package com.karla.paymentservice.service;

import com.karla.paymentservice.dtos.PaymentRequestDTO;
import com.karla.paymentservice.strategies.CreditCardPaymentStrategy;
import com.karla.paymentservice.strategies.PaymentStrategy;
import com.karla.paymentservice.strategies.PaypalPaymentStrategy;
import com.karla.paymentservice.strategies.PixPaymentStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    Map<String, PaymentStrategy> paymentStrategies;

    public PaymentService(Map<String, PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public String processPayment(PaymentRequestDTO payment) {
        final Double amount = payment.amount();
        final var paymentStrategy = paymentStrategies.getOrDefault(payment.method(), paymentStrategies.get("CREDIT_CARD"));
        return paymentStrategy.processPayment(amount);
    }
}
