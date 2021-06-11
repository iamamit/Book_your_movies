package com.example.amit.restservices.bookyourmovies.cinema;

import com.example.amit.restservices.bookyourmovies.movie.Movie;
import com.example.amit.restservices.bookyourmovies.movie.MovieRepository;
import com.example.amit.restservices.bookyourmovies.user.User;
import com.example.amit.restservices.bookyourmovies.user.UserDaoService;
import com.example.amit.restservices.bookyourmovies.user.UserRepository;
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

    @GetMapping("/cinemas/addmovie/cinema/{cinemaid}/movie/{movieid}")
    public ResponseEntity setMovieForCinema(@PathVariable int cinemaid, @PathVariable int movieid) throws Exception {
        Cinema cinema = cinemaRepository.findById(cinemaid).get();
        if (null == cinema) throw new Exception("User not found");

        Movie movie = movieRepository.findById(movieid).get();
        if(null == movie) throw new Exception("No such movie exists");

        List<Cinema> cinemaList = movie.getCinemaList();
        List<Movie> movieList = cinema.getMovieList();
        if(null == cinemaList) cinemaList = new ArrayList<>();
        if(null == movieList) movieList = new ArrayList<>();

        cinemaList.add(cinema);
        movieList.add(movie);

        movie.setCinemaList(cinemaList);
        cinema.setMovieList(movieList);

        cinemaRepository.save(cinema);
        movieRepository.save(movie);

        return ResponseEntity.ok().build();

    }
}
