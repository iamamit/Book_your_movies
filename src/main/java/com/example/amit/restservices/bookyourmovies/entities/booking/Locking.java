package com.example.amit.restservices.bookyourmovies.entities.booking;

public class Locking extends Thread{

    private Booking booking;

    public Locking(Booking booking) {
        this.booking = booking;
    }

    public void lockSeat() {
        synchronized (booking) {

        }
    }
}
