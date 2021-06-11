package com.example.amit.restservices.bookyourmovies.city;

import com.example.amit.restservices.bookyourmovies.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.movie.Movie;

import javax.persistence.*;
import java.util.List;

@Entity
public class City {

    @Id
    @GeneratedValue
    @Column(name = "city_id")
    private Integer id;
    private String name;
    private String State;
    private String country;
    private Integer pin;

    @ManyToMany
    private List<Movie> movieList;

    @OneToMany(mappedBy = "city")
    private List<Cinema> cinemaList;

    public City() {
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

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", State='" + State + '\'' +
                ", country='" + country + '\'' +
                ", pin=" + pin +
                ", movieList=" + movieList +
                ", cinemaList=" + cinemaList +
                '}';
    }
}
