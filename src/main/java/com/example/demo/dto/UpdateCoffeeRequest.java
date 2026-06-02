package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record UpdateCoffeeRequest(
        @NotBlank(message = "Name is required")
        @Size(min = 3, max = 250,message = "Name is required")
        String name,

        @NotBlank(message = "Description is required")
        @Size(min = 3, max = 1000, message ="Description is required")
        String description,

        @Positive(message = "Price most be positive!")
        @NotNull
        Double price
) {
}
