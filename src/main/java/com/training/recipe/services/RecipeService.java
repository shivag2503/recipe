package com.training.recipe.services;

import com.training.recipe.domain.Recipe;

import java.util.Set;

/**
 * Created by Shivam Agrawal on 16-05-2020
 * inside the package - com.training.recipe.services
 */

public interface RecipeService {

    Set<Recipe> getRecipes();

}
