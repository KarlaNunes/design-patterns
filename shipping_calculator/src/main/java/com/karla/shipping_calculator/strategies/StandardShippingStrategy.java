package com.karla.shipping_calculator.strategies;

public class StandardShippingStrategy implements ShippingCalculatorStrategy {
    @Override
    public double calculateShipping(double weight) {
        final double shippingTax = 5.00;
        return shippingTax + 1.5 * weight;
    }
}
