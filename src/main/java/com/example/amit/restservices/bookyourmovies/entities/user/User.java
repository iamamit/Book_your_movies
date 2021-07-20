package com.example.amit.restservices.bookyourmovies.entities.user;

import com.example.amit.restservices.bookyourmovies.entities.booking.Booking;
import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String role;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookingList;

    public User() {
    }

    public User(Integer id, String name, Integer age, String email, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.role = role;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", bookingList=" + bookingList +
                '}';
    }
}
