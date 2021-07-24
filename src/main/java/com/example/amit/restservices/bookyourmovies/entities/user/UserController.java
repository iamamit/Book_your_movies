package com.example.amit.restservices.bookyourmovies.entities.user;

import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;
import com.example.amit.restservices.bookyourmovies.entities.movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity userSignup(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.ok().build();

    }

    @PostMapping("/login")
    public ResponseEntity userLogin(@RequestBody User user) throws Exception {
        String email = user.getEmail();

        List<User> userList = userRepository.findByEmail(email);
        if(null == userList) throw new Exception("User Nor found");


        return ResponseEntity.ok().build();

    }
}
