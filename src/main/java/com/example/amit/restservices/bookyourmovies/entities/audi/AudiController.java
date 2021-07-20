package com.example.amit.restservices.bookyourmovies.entities.audi;

import com.example.amit.restservices.bookyourmovies.entities.seat.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audis")
public class AudiController {

    @Autowired
    private AudiRepository audiRepository;

    /**
     * Find All Audi
     * */
    @GetMapping("/findall")
    public List<Audi> findAllAudi() {
        List<Audi> audiList = audiRepository.findAll();
        return audiList;
    }
}
