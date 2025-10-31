package com.karla.shipping_calculator.service;

import com.karla.shipping_calculator.dtos.Order;
import com.karla.shipping_calculator.strategies.ExpressShippingStrategy;
import com.karla.shipping_calculator.strategies.PickupShippingStrategy;
import com.karla.shipping_calculator.strategies.ShippingCalculatorStrategy;
import com.karla.shipping_calculator.strategies.StandardShippingStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ShippingCalculatorService {

    public double calculateShipping(Order order) {
        final Double weight = order.productWeight();

        return switch (order.type()){
            case "express" -> new ExpressShippingStrategy().calculateShipping(weight);
            case "standard" -> new StandardShippingStrategy().calculateShipping(weight);
            default -> new PickupShippingStrategy().calculateShipping(weight);
        };
    }
}
