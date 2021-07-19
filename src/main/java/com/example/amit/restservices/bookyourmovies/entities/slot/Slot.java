package com.example.amit.restservices.bookyourmovies.entities.slot;

import com.example.amit.restservices.bookyourmovies.entities.audi.Audi;
import com.example.amit.restservices.bookyourmovies.entities.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Slot {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Cinema cinema;

    private int audiId;

    private int movieId;

    @Temporal(TemporalType.DATE)
    private Date slotDate;

    @Temporal(TemporalType.TIME)
    private Date slotTime;

}
