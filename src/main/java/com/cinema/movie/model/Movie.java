package com.cinema.movie.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_movie")
    private String nameMovie;

    @Column(name = "price_movie")
    private int priceMovie;

    @Column(name = "category_movie")
    private String categoryMovie;
}
