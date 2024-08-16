package co.istad.springmongodb.features.category;

import co.istad.springmongodb.features.category.dto.CategoryCreateRequest;
import co.istad.springmongodb.features.category.dto.CategoryResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CategoryResponse createCategory(@RequestBody @Valid CategoryCreateRequest categoryCreateRequest){

        return categoryService.createCategory(categoryCreateRequest);
    }

    @GetMapping
    public List<CategoryResponse> findAll(){
        return categoryService.findAll();
    }

}
