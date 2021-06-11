package com.example.amit.restservices.bookyourmovies.movie;

import com.example.amit.restservices.bookyourmovies.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @GetMapping("/movies/{id}")
    public Movie findById(@PathVariable int id) {
        Optional<Movie> optionMovie = movieRepository.findById(id);
        Movie movie = optionMovie.get();
        return movie;
    }

    @PostMapping("/movies/createone")
    public ResponseEntity save(@RequestBody Movie movie) {
        movieRepository.save(movie);
        return ResponseEntity.status(201).build();
    }
}
