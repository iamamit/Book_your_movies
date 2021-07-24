package com.example.amit.restservices.bookyourmovies;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public ResponseEntity hello() {
        return ResponseEntity.ok().build();
    }
}
