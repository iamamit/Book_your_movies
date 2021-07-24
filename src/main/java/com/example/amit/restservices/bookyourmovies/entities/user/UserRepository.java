package com.example.amit.restservices.bookyourmovies.entities.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("select u.id from User u where u.email=?1")
    List<User> findByEmail(String email);

}
