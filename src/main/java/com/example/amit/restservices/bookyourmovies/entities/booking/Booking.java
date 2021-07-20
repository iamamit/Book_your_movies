package com.example.amit.restservices.bookyourmovies.entities.booking;

import com.example.amit.restservices.bookyourmovies.entities.audi.Audi;
import com.example.amit.restservices.bookyourmovies.entities.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;
import com.example.amit.restservices.bookyourmovies.entities.seat.Seat;
import com.example.amit.restservices.bookyourmovies.entities.slot.Slot;
import com.example.amit.restservices.bookyourmovies.entities.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int id;


    @ManyToOne
    private Seat seat;

    @ManyToOne
    private Slot slot;

    @ManyToOne
    private User user;


    public Booking() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", seat=" + seat +
                ", slot=" + slot +
                ", user=" + user +
                '}';
    }
}
