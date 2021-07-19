package com.example.amit.restservices.bookyourmovies.entities.booking;

import com.example.amit.restservices.bookyourmovies.entities.audi.Audi;
import com.example.amit.restservices.bookyourmovies.entities.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;
import com.example.amit.restservices.bookyourmovies.entities.seat.Seat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int id;

    private int movieId;

    private int cinemaId;

    private int audiId;

    private int seatId;

    @Temporal(TemporalType.DATE)
    private Date bookedDate;

    @Temporal(TemporalType.TIME)
    private Date bookedTime;


    public Booking() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }

    public int getAudiId() {
        return audiId;
    }

    public void setAudiId(int audiId) {
        this.audiId = audiId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public Date getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(Date bookedDate) {
        this.bookedDate = bookedDate;
    }

    public Date getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(Date bookedTime) {
        this.bookedTime = bookedTime;
    }
}
