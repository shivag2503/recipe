package com.training.recipe.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by ShivamAgrawal on 16-05-2020
 * inside the package - com.training.recipe.domain
 */

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
