package co.istad.springmongodb.features.category.dto;

import jakarta.validation.constraints.NotEmpty;

public record CategoryCreateRequest(
        @NotEmpty(message = "Name is required")
        String name
) {
}
