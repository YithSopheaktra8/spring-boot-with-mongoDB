package co.istad.springmongodb.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String uuid;
    private String name;
    private String description;
    private double price;
    private int quantity;

    @DocumentReference
    private Category category;
}
