package com.example.amit.restservices.bookyourmovies.entities.slot;

import com.example.amit.restservices.bookyourmovies.entities.audi.Audi;
import com.example.amit.restservices.bookyourmovies.entities.booking.Booking;
import com.example.amit.restservices.bookyourmovies.entities.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
public class Slot {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Cinema cinema;

    @ManyToOne
    private Audi audi;

    @ManyToOne
    private Movie movie;

    @Temporal(TemporalType.DATE)
    private Date slotDate;

    @Temporal(TemporalType.TIME)
    private Date slotTime;

    @OneToMany(mappedBy = "slot")
    private List<Booking> bookingList;


    public Slot() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Audi getAudi() {
        return audi;
    }

    public void setAudi(Audi audi) {
        this.audi = audi;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getSlotDate() {
        return slotDate;
    }

    public void setSlotDate(Date slotDate) {
        this.slotDate = slotDate;
    }

    public Date getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(Date slotTime) {
        this.slotTime = slotTime;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "id=" + id +
                ", cinema=" + cinema +
                ", audi=" + audi +
                ", movie=" + movie +
                ", slotDate=" + slotDate +
                ", slotTime=" + slotTime +
                '}';
    }
}
