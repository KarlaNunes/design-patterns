package com.karla.shipping_calculator.strategies;

public class ExpressShippingStrategy implements ShippingCalculatorStrategy {
    @Override
    public double calculateShipping(double weight) {
        final double shippingTax = 10.00;
        return shippingTax + 3 * weight;
    }
}
