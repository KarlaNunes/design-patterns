package com.karla.shipping_calculator.controller;

import com.karla.shipping_calculator.dtos.Order;
import com.karla.shipping_calculator.dtos.ShippingOrder;
import com.karla.shipping_calculator.service.ShippingCalculatorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shipping/calculate")
public class ShippingCalculatorController {

    final private ShippingCalculatorService shippingCalculatorService;

    public ShippingCalculatorController(ShippingCalculatorService shippingCalculatorService) {
        this.shippingCalculatorService = shippingCalculatorService;
    }

    @PostMapping
    public ResponseEntity<ShippingOrder> getShippingOrder(@RequestBody @Valid Order order){
        Double shippingPrice = shippingCalculatorService.calculateShipping(order);
        ShippingOrder shippingOrder = new ShippingOrder(shippingPrice);
        return ResponseEntity.ok(shippingOrder);
    }
}
