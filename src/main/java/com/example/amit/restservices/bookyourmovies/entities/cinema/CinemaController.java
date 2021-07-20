package com.example.amit.restservices.bookyourmovies.entities.cinema;

import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;
import com.example.amit.restservices.bookyourmovies.entities.movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CinemaController {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/cinemas")
    public List<Cinema> findAll() {
        return cinemaRepository.findAll();
    }

    @GetMapping("/cinema/{id}")
    public Cinema findById(@PathVariable int id) {
        Optional<Cinema> optionCinema = cinemaRepository.findById(id);
        Cinema cinema = optionCinema.get();
        return cinema;
    }

    @PostMapping("/cinemas/createone")
    public ResponseEntity save(@RequestBody Cinema cinema) {
        cinemaRepository.save(cinema);
        return ResponseEntity.status(201).build();
    }

}
