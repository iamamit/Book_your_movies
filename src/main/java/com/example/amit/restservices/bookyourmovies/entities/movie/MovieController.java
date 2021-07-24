package com.example.amit.restservices.bookyourmovies.entities.movie;

import com.example.amit.restservices.bookyourmovies.entities.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.entities.cinema.CinemaRepository;
import com.example.amit.restservices.bookyourmovies.helpers.movie.MovieHelper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CinemaRepository cinemaRepository;



    @PostMapping("/insert/poster")
    public ResponseEntity insertMoviePosterInBulk() throws Exception {
        MovieHelper movieHelper = new MovieHelper();

        List<Movie> movieList = movieRepository.findAll();
        for(int i = 0;i<movieList.size();i++) {
            Movie movie = movieList.get(i);
            try {
                movieHelper.saveImageInMovie(movie);
                movieRepository.save(movie);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findall")
    public List<Movie> findAll() {

        MovieHelper movieHelper = new MovieHelper();
        List<Movie> movieList =  movieRepository.findAll();
        for (int i = 0; i < movieList.size();i++) {
            Movie movie = movieList.get(i);
            movie.setPoster(movie.getName().toLowerCase()+".jpg");
        }

        return movieList;
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


    @GetMapping("/{id}/cinemas")
    public List<Cinema> movieCinemaList(@PathVariable int id) throws Exception {
        Movie movie = movieRepository.findById(id).get();
        if(null == movie) throw new Exception("Movie not found for the id: "+id);

        List<Cinema> cinemaList = movie.getCinemaList();
        return cinemaList;
    }
}
