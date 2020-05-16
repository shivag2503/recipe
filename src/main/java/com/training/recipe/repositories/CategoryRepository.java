package com.training.recipe.repositories;

import com.training.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Shivam Agrawal on 16-05-2020
 * inside the package - com.training.recipe.repositories
 */

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
