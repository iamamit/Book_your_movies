package com.example.amit.restservices.bookyourmovies.audi;

import com.example.amit.restservices.bookyourmovies.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.movie.Movie;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Audi {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Cinema cinema;

    @OneToOne
    private Movie movie;

    public Audi() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cinema=" + cinema +
                ", movie=" + movie +
                '}';
    }
}
