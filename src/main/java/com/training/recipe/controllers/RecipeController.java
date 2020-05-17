package com.training.recipe.controllers;

import com.training.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shivam Agrawal on 16-05-2020
 * inside the package - com.training.recipe.controllers
 */

@Slf4j
@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/recipe"})
    public String getRecipes(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "recipe";
    }
}
