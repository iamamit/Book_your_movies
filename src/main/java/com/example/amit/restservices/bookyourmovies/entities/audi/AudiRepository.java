package com.example.amit.restservices.bookyourmovies.entities.audi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudiRepository extends JpaRepository<Audi,Integer> {

}
