package com.training.recipe.repositories;

import com.training.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Shivam Agrawal on 16-05-2020
 * inside the package - com.training.recipe.repositories
 */

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
