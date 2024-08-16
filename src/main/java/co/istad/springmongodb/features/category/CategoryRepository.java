package co.istad.springmongodb.features.category;

import co.istad.springmongodb.domain.Category;
import co.istad.springmongodb.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CategoryRepository extends MongoRepository<Category,String> {

    Optional<Category> findCategoryByUuid(String uuid);

}
