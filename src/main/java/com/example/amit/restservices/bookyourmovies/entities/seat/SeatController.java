package com.example.amit.restservices.bookyourmovies.entities.seat;

import com.example.amit.restservices.bookyourmovies.entities.audi.Audi;
import com.example.amit.restservices.bookyourmovies.entities.audi.AudiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private AudiRepository audiRepository;

    @PostMapping("/insert/bulk")
    public ResponseEntity insertSeatIntoAudiInBulk() {
        List<Audi> audiList = audiRepository.findAll();
        for(int i = 0; i<audiList.size(); i++) {
            Audi audi = audiList.get(i);

            for(int j = 0;j<100;j++) {
                Seat seat = new Seat();
                seat.setAudi(audi);
                seatRepository.save(seat);
            }
        }

        return ResponseEntity.ok().build();
    }
}
