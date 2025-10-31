package com.karla.shipping_calculator.strategies;

public class PickupShippingStrategy implements ShippingCalculatorStrategy {
    @Override
    public double calculateShipping(double weight) {
        final double shippingTax = 0.0;
        return shippingTax * weight;
    }
}
