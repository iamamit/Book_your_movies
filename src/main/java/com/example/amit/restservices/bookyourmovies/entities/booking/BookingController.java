package com.example.amit.restservices.bookyourmovies.entities.booking;

import com.example.amit.restservices.bookyourmovies.entities.seat.Seat;
import com.example.amit.restservices.bookyourmovies.entities.seat.SeatRepository;
import com.example.amit.restservices.bookyourmovies.entities.slot.Slot;
import com.example.amit.restservices.bookyourmovies.entities.slot.SlotRepository;
import com.example.amit.restservices.bookyourmovies.entities.user.User;
import com.example.amit.restservices.bookyourmovies.entities.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SlotRepository slotRepository;

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/demo")
    public String demoBookings() {
        return "Booking Demo";
    }

    @GetMapping("/findall")
    public List<Booking> findAllBookings() {
        return bookingRepository.findAll();
    }

    @PostMapping("/lock/user/{userId}/slot/{slotId}/seat/{seatId}")
    public ResponseEntity lockSeatForUserAndSlot(@PathVariable int userId, @PathVariable int slotId, @PathVariable int seatId) throws Exception {

        User user = userRepository.findById(userId).get();
        if(null == user) throw new Exception("User Not Found Exception");

        Slot slot = slotRepository.findById(slotId).get();
        if(null == slot) throw new Exception("User Not Found Exception");

        Seat seat = seatRepository.findById(seatId).get();
        if(null == seat) throw new Exception("User Not Found Exception");

//        List<Booking> bookingList = bookingRepository.findAllBookingBySlotIdAndSeatId(slot,seat);
//
//        if( !(null == bookingList || 0 == bookingList.size()) ) throw new Exception("Seat already booked");

        Booking booking = new Booking();
        booking.setSeat(seat);
        booking.setSlot(slot);
        booking.setUser(user);

        List<Locking> lockingList = new ArrayList<>();
        for(int i = 1; i<9;i++) {
            User user2 = userRepository.findById(i+userId).get();
            Locking locking = new Locking(booking,user2);
            lockingList.add(locking);

        }

        for(Locking locking: lockingList) {
            locking.start();
        }

//        bookingRepository.save(booking);

        return ResponseEntity.ok().build();
    }

}
