package com.example.amit.restservices.bookyourmovies.entities.audi;

import com.example.amit.restservices.bookyourmovies.entities.cinema.Cinema;
import com.example.amit.restservices.bookyourmovies.entities.seat.Seat;
import com.example.amit.restservices.bookyourmovies.entities.slot.Slot;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Audi {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Cinema cinema;

    @OneToMany(mappedBy = "audi")
    private List<Seat> seatList;

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

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cinema=" + cinema +
                ", seatList=" + seatList +
                '}';
    }
}
