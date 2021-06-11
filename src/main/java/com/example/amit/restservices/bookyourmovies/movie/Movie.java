package com.example.amit.restservices.bookyourmovies.movie;

import com.example.amit.restservices.bookyourmovies.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.city.City;
import com.example.amit.restservices.bookyourmovies.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
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

    @JsonIgnore
    @ManyToMany
    private List<User> userList;

    @JsonIgnore
    @ManyToMany
    private List<City> cityList;

    @JsonIgnore
    @ManyToMany
    private List<Cinema> cinemaList;

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

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", rating=" + rating +
                ", userList=" + userList +
                ", cityList=" + cityList +
                ", cinemaList=" + cinemaList +
                '}';
    }
}
