package com.karla.paymentservice.dtos;

import jakarta.validation.constraints.NotNull;

public record PaymentRequestDTO(
        @NotNull String method,
        @NotNull Double amount
) {
}
