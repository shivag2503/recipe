package com.training.recipe.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Shivam Agrawal on 16-05-2020
 * inside the package - com.training.recipe.domain
 */

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
