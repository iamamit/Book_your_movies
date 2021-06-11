package com.example.amit.restservices.bookyourmovies.movie;

import com.example.amit.restservices.bookyourmovies.user.User;

import java.util.ArrayList;
import java.util.List;

public class MovieDaoService {

    private static List<Movie> movieList = new ArrayList<>();
    private static int movieCount = 3;
    public Movie save(Movie movie) {
        if(null == movie.getId()) {
            movie.setId(++movieCount);
        }
        movieList.add(movie);
        return movie;
    }
}
