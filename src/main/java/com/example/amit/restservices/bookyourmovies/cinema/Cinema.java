package com.example.amit.restservices.bookyourmovies.cinema;

import com.example.amit.restservices.bookyourmovies.audi.Audi;
import com.example.amit.restservices.bookyourmovies.city.City;
import com.example.amit.restservices.bookyourmovies.movie.Movie;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.support.MethodOverride;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cinema {

    @Id
    @GeneratedValue
    @Column(name = "cinema_id")
    private Integer id;
    private String name;

    @ManyToOne
    @JsonIgnore
    private City city;

    @OneToMany(mappedBy = "cinema")
    private List<Audi> audiList;

    @OneToMany
    private List<Movie> movieList;

    public Cinema() {
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Audi> getAudiList() {
        return audiList;
    }

    public void setAudiList(List<Audi> audiList) {
        this.audiList = audiList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                ", audiList=" + audiList +
                ", movieList=" + movieList +
                '}';
    }
}
