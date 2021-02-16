package com.cinema.movie.service.implementation;

import com.cinema.movie.model.Movie;
import com.cinema.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImplementation {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public String saveMovie(Movie movie){
        movieRepository.save(movie);
        return "movie was saved";
    }
}
