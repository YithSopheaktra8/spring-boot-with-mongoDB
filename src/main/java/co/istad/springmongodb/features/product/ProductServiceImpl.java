package co.istad.springmongodb.features.product;

import co.istad.springmongodb.domain.Category;
import co.istad.springmongodb.domain.Product;
import co.istad.springmongodb.features.category.CategoryRepository;
import co.istad.springmongodb.features.product.dto.CreateProductRequest;
import co.istad.springmongodb.features.product.dto.ProductResponse;
import co.istad.springmongodb.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Random;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final CategoryRepository categoryRepository;

    @Override
    public ProductResponse createProduct(CreateProductRequest createProductRequest) {

        Product product = productMapper.fromCreateProductRequestToProduct(createProductRequest);

        Category category = categoryRepository.findCategoryByUuid(createProductRequest.categoryUuid())
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Category not found"
                ));

        product.setCategory(category);
        product.setUuid(UUID.randomUUID().toString());

        productRepository.insert(product);

        return productMapper.fromProductToProductResponse(product);
    }
}
