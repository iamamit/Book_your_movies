package com.example.amit.restservices.bookyourmovies.entities.address;

import com.example.amit.restservices.bookyourmovies.entities.cinema.Cinema;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private Integer id;
    private String city;
    private String State;
    private String country;
    private Integer pin;


    @JsonIgnore
    @OneToMany(mappedBy = "address")
    private List<Cinema> cinemaList;

    public Address() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public List<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void setCinemaList(List<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", State='" + State + '\'' +
                ", country='" + country + '\'' +
                ", pin=" + pin +
                ", cinemaList=" + cinemaList +
                '}';
    }
}
