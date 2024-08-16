package co.istad.springmongodb.mapper;

import co.istad.springmongodb.domain.Category;
import co.istad.springmongodb.features.category.dto.CategoryResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryResponse fromCategoryToCategoryResponse(Category category);

    List<CategoryResponse> fromCategoryListToCategoryResponseList(List<Category> categoryList);
}
