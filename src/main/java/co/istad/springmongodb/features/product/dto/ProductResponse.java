package co.istad.springmongodb.features.product.dto;

public record ProductResponse(
        String uuid,
        String name,
        String description,
        Double price,
        Integer quantity
) {
}
