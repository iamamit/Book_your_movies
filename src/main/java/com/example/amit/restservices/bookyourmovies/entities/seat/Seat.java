package com.example.amit.restservices.bookyourmovies.entities.seat;

import com.example.amit.restservices.bookyourmovies.entities.audi.Audi;
import com.example.amit.restservices.bookyourmovies.entities.user.User;

import javax.persistence.*;

@Entity
public class Seat {

    @Id
    @GeneratedValue
    @Column(name = "seat_id")
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Audi audi;

    public Seat() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Audi getAudi() {
        return audi;
    }

    public void setAudi(Audi audi) {
        this.audi = audi;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", user=" + user +
                ", audi=" + audi +
                '}';
    }
}
