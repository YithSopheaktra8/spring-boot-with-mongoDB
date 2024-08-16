package co.istad.springmongodb.features.category;

import co.istad.springmongodb.domain.Category;
import co.istad.springmongodb.features.category.dto.CategoryCreateRequest;
import co.istad.springmongodb.features.category.dto.CategoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    CategoryResponse createCategory(CategoryCreateRequest categoryCreateRequest);

    List<CategoryResponse> findAll();

}
