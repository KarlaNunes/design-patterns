package com.karla.shipping_calculator.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Order(
       @NotBlank String type,
       @NotNull Double productWeight
) {
}
