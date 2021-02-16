package com.cinema.movie.controller;

import com.cinema.movie.model.Movie;
import com.cinema.movie.service.implementation.MovieServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {


    @Autowired
    MovieServiceImplementation movieServiceImplementation;

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieServiceImplementation.getAllMovies();
    }

    @PostMapping
    public String saveMovie(@RequestBody Movie movie){
        return movieServiceImplementation.saveMovie(movie);
    }
}
