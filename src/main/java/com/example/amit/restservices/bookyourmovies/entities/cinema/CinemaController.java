package com.example.amit.restservices.bookyourmovies.entities.cinema;

import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;
import com.example.amit.restservices.bookyourmovies.entities.movie.MovieRepository;
import com.example.amit.restservices.bookyourmovies.entities.slot.Slot;
import com.example.amit.restservices.bookyourmovies.entities.slot.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {

    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private SlotRepository slotRepository;

    @GetMapping("")
    public List<Cinema> findAll() {
        return cinemaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cinema findById(@PathVariable int id) {
        Optional<Cinema> optionCinema = cinemaRepository.findById(id);
        Cinema cinema = optionCinema.get();
        return cinema;
    }

    @PostMapping("/createone")
    public ResponseEntity save(@RequestBody Cinema cinema) {
        cinemaRepository.save(cinema);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/{cinemaId}/insertmovie/{movieId}")
    public ResponseEntity save(@PathVariable int cinemaId, @PathVariable int movieId) throws Exception {

        Cinema cinema = cinemaRepository.findById(cinemaId).get();
        if(null == cinema) throw  new Exception("Cinema not found id: "+cinemaId);

        Movie movie = movieRepository.findById(movieId).get();
        if(null == movie) throw  new Exception("Movie not found id: "+movieId);

        List<Slot> slotList = cinema.getSlotList();

        boolean movieBooked = false;
        for(int i = 0; i < slotList.size();i++) {
            Slot slot = slotList.get(i);
            if(null == slot.getMovie()) {
                movieBooked = true;
                slot.setMovie(movie);
                slotRepository.save(slot);
                break;
            }
        }

        if(movieBooked) {
            List<Movie> movieList = cinema.getMovieList();
            movieList.add(movie);
            cinema.setMovieList(movieList);
            cinemaRepository.save(cinema);
        }
        else throw new Exception("Slot is not empty");


        return ResponseEntity.status(201).build();
    }

}
