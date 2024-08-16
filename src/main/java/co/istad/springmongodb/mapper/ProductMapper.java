package co.istad.springmongodb.mapper;

import co.istad.springmongodb.domain.Product;
import co.istad.springmongodb.features.product.dto.CreateProductRequest;
import co.istad.springmongodb.features.product.dto.ProductResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product fromCreateProductRequestToProduct(CreateProductRequest createProductRequest);

    ProductResponse fromProductToProductResponse(Product product);

}
