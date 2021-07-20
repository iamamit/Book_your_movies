package com.example.amit.restservices.bookyourmovies.entities.slot;

import com.example.amit.restservices.bookyourmovies.entities.seat.Seat;
import com.example.amit.restservices.bookyourmovies.entities.seat.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/slots")
public class SlotController {

    @Autowired
    private SlotRepository seatRepository;

    @GetMapping("/findall/set")
    public Set<Slot> findAllSlotInSet() {
        List<Slot> slotList = seatRepository.findAll();

        Set<Slot> slotSet = new HashSet<>();
        for (Slot slot:slotList) {
            slotSet.add(slot);
        }

        return slotSet;
    }
}
