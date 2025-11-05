package com.karla.shipping_calculator.strategies;

import org.springframework.stereotype.Component;

@Component("pickup")
public class PickupShippingStrategy implements ShippingCalculatorStrategy {
    @Override
    public double calculateShipping(double weight) {
        final double shippingTax = 0.0;
        return shippingTax * weight;
    }
}
