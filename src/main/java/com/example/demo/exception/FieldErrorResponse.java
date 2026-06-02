package com.example.demo.exception;

import lombok.Builder;

@Builder
public record FieldErrorResponse(
        String field,
        String message
) {

}
