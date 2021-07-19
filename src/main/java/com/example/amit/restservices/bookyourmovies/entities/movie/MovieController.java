package com.example.amit.restservices.bookyourmovies.entities.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/findall")
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @GetMapping("/findbyid/{id}")
    public Movie findById(@PathVariable int id) {
        Optional<Movie> optionMovie = movieRepository.findById(id);
        Movie movie = optionMovie.get();
        return movie;
    }

    @PostMapping("/insert")
    public ResponseEntity save(@RequestBody Movie movie) {
        movieRepository.save(movie);
        return ResponseEntity.status(201).build();
    }
}
