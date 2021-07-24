package com.example.amit.restservices.bookyourmovies.entities.booking;

import com.example.amit.restservices.bookyourmovies.entities.seat.Seat;
import com.example.amit.restservices.bookyourmovies.entities.slot.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>, CrudRepository <Booking,Integer>{

    @Query("select b from Booking b where b.slot=?1 and b.seat=?2")
    List<Booking> findAllBookingBySlotIdAndSeatId(Slot slot, Seat seat);
}
