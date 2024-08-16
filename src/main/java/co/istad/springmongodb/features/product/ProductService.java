package co.istad.springmongodb.features.product;

import co.istad.springmongodb.domain.Product;
import co.istad.springmongodb.features.product.dto.CreateProductRequest;
import co.istad.springmongodb.features.product.dto.ProductResponse;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    ProductResponse createProduct(CreateProductRequest createProductRequest);

}
