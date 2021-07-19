package com.example.amit.restservices.bookyourmovies.entities.cinema;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Integer> {
}
