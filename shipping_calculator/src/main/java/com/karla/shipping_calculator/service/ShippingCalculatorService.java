package com.karla.shipping_calculator.service;

import com.karla.shipping_calculator.dtos.Order;
import com.karla.shipping_calculator.strategies.ShippingCalculatorStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ShippingCalculatorService {

    Map<String, ShippingCalculatorStrategy> strategies;

    public ShippingCalculatorService(Map<String, ShippingCalculatorStrategy> strategies) {
        this.strategies = strategies;
    }

    public double calculateShipping(Order order) {
        final Double weight = order.productWeight();

        return strategies.getOrDefault(order.type(), strategies.get("pickup")).calculateShipping(weight);
    }
}
