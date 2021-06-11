package com.example.amit.restservices.bookyourmovies.city;

import com.example.amit.restservices.bookyourmovies.movie.Movie;
import com.example.amit.restservices.bookyourmovies.movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/cities")
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @GetMapping("/cities/{id}")
    public City findById(@PathVariable int id) {
        Optional<City> optionCity = cityRepository.findById(id);
        City city = optionCity.get();
        return city;
    }

    @PostMapping("/cities/createone")
    public ResponseEntity save(@RequestBody City city) {
        cityRepository.save(city);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/cities/addmovie/city/{cityid}/movie/{movieid}")
    public ResponseEntity setMovieForCity(@PathVariable int cityid, @PathVariable int movieid) throws Exception {
        City city = cityRepository.findById(cityid).get();
        if (null == city) throw new Exception("City not found");

        Movie movie = movieRepository.findById(movieid).get();
        if(null == movie) throw new Exception("No such movie exists");

        List<City> cityList = movie.getCityList();
        List<Movie> movieList = city.getMovieList();
        if(null == cityList) cityList = new ArrayList<>();
        if(null == movieList) movieList = new ArrayList<>();

        cityList.add(city);
        movieList.add(movie);

        movie.setCityList(cityList);
        city.setMovieList(movieList);

        cityRepository.save(city);
        movieRepository.save(movie);

        return ResponseEntity.ok().build();

    }
}
