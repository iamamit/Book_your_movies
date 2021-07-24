package com.example.amit.restservices.bookyourmovies.entities.movie;

import com.example.amit.restservices.bookyourmovies.entities.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.entities.slot.Slot;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    @Column(name = "movie_id")
    private Integer id;

    private String name;
    private String country;
    private Float rating;

    @Lob
    private String poster;

    @JsonIgnore
    @ManyToMany(mappedBy = "movieList")
    private List<Cinema> cinemaList;

    @JsonIgnore
    @OneToMany(mappedBy = "movie")
    private List<Slot> slotList;

    public Movie() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public List<Slot> getSlotList() {
        return slotList;
    }

    public void setSlotList(List<Slot> slotList) {
        this.slotList = slotList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", rating=" + rating +
                ", poster=" + poster +
                ", cinemaList=" + cinemaList +
                ", slotList=" + slotList +
                '}';
    }
}
