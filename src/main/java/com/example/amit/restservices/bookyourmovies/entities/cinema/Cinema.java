package com.example.amit.restservices.bookyourmovies.entities.cinema;

import com.example.amit.restservices.bookyourmovies.entities.address.Address;
import com.example.amit.restservices.bookyourmovies.entities.audi.Audi;
import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;
import com.example.amit.restservices.bookyourmovies.entities.slot.Slot;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cinema {

    @Id
    @GeneratedValue
    @Column(name = "cinema_id")
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "cinema")
    private List<Audi> audiList;

    @ManyToMany(mappedBy = "cinemaList")
    private List<Movie> movieList;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Address address;

    @OneToMany(mappedBy = "cinema")
    private List<Slot> slotList;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Slot> getSlotList() {
        return slotList;
    }

    public void setSlotList(List<Slot> slotList) {
        this.slotList = slotList;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", audiList=" + audiList +
                ", movieList=" + movieList +
                ", address=" + address +
                ", slotList=" + slotList +
                '}';
    }
}
