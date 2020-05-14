package com.training.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shivam Agrawal on 14-05-2020
 * inside the package - com.training.recipe.controllers
 */

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getIndexPage() {

        return "index";
    }
}
