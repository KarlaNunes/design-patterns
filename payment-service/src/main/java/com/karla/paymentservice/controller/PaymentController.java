package com.karla.paymentservice.controller;

import com.karla.paymentservice.dtos.PaymentRequestDTO;
import com.karla.paymentservice.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    final private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<String> processPayment(@RequestBody @Valid PaymentRequestDTO paymentRequest) {
        final String response = paymentService.processPayment(paymentRequest);
        return ResponseEntity.ok().body(response);
    }
}
