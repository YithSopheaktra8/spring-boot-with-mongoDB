package co.istad.springmongodb.features.category;

import co.istad.springmongodb.domain.Category;
import co.istad.springmongodb.features.category.dto.CategoryCreateRequest;
import co.istad.springmongodb.features.category.dto.CategoryResponse;
import co.istad.springmongodb.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryResponse createCategory(CategoryCreateRequest categoryCreateRequest) {

        Category category = new Category();
        category.setUuid(UUID.randomUUID().toString());
        category.setName(categoryCreateRequest.name());

        category = categoryRepository.insert(category);

        return categoryMapper.fromCategoryToCategoryResponse(category);
    }

    @Override
    public List<CategoryResponse> findAll() {

        return categoryMapper.fromCategoryListToCategoryResponseList(categoryRepository.findAll());
    }
}
