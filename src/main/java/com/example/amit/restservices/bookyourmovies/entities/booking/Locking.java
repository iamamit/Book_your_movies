package com.example.amit.restservices.bookyourmovies.entities.booking;

import com.example.amit.restservices.bookyourmovies.entities.seat.Seat;
import com.example.amit.restservices.bookyourmovies.entities.slot.Slot;
import com.example.amit.restservices.bookyourmovies.entities.user.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Locking extends Thread{

    private Booking booking;
    private User user;

    @Autowired
    private BookingRepository bookingRepository;

    public Locking(Booking booking, User user) {
        this.booking = booking;
        this.user = user;
    }

    @Override
    public void run() {
        try {
            lockSeat();
        } catch (Exception e) {
//            e.printStackTrace();
            try {
                throw new Exception("Seat is already booked");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void lockSeat() throws Exception {
        synchronized (this.booking) {
            Slot slot = this.booking.getSlot();
            Seat seat = this.booking.getSeat();
            List<Booking> bookingList = bookingRepository.findAllBookingBySlotIdAndSeatId(slot,seat);

            if( !(null == bookingList || 0 == bookingList.size()) ) throw new Exception("Seat already booked");

            bookingRepository.save(booking);
        }
    }
}
