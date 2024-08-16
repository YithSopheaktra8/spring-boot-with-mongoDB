package co.istad.springmongodb.features.product.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record CreateProductRequest(
        @NotEmpty(message = "Name is required")
        String name,
        @NotEmpty(message = "Description is required")
        String description,
        @NotNull(message = "Price is required")
        Double price,
        @NotNull(message = "Quantity is required")
        Integer quantity,
        @NotEmpty
        String categoryUuid
) {
}
