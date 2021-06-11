package com.example.amit.restservices.bookyourmovies.user;

import com.example.amit.restservices.bookyourmovies.movie.Movie;
import com.example.amit.restservices.bookyourmovies.movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/demouser")
    public User demoUser() {
        return new User(0,"Demo",25,"demoemail@gmail.com","User");
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable int id) {
        Optional<User> optionUser = userRepository.findById(id);
        User user = optionUser.get();
        return user;
    }

    @PostMapping("/users/createone")
    public ResponseEntity save(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/users/addmovie/user/{userid}/movie/{movieid}")
    public ResponseEntity setMovieForUser(@PathVariable int userid, @PathVariable int movieid) throws Exception {
        User user = userRepository.findById(userid).get();
        if (null == user) throw new Exception("User not found");

        Movie movie = movieRepository.findById(movieid).get();
        if(null == movie) throw new Exception("No such movie exists");

        List<User> userList = movie.getUserList();
        List<Movie> movieList = user.getMovieList();
        if(null == userList) userList = new ArrayList<>();
        if(null == movieList) movieList = new ArrayList<>();

        userList.add(user);
        movieList.add(movie);

        movie.setUserList(userList);
        user.setMovieList(movieList);

        userRepository.save(user);
        movieRepository.save(movie);

        return ResponseEntity.ok().build();

    }
}
