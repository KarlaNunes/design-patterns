package com.karla.shipping_calculator.service;

import com.karla.shipping_calculator.dtos.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingCalculatorService {

    public double calculateShipping(Order order) {
        final Double weight = order.productWeight();

        return switch (order.type()){
            case "express" -> calculateExpressShipping(weight);
            case "standard" -> calculateStandardShipping(weight);
            default -> calculatePickupShipping();
        };
    }

    private double calculateExpressShipping(double weight){
        return 10.00 + 3 * weight;
    }

    private double calculateStandardShipping(double weight){
        return 5.00 + 1.5 * weight;
    }

    private double calculatePickupShipping(){
        return 0.00;
    }
}
