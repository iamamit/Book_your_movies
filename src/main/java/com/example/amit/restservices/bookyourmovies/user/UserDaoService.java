package com.example.amit.restservices.bookyourmovies.user;

import com.example.amit.restservices.bookyourmovies.movie.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;
    static {
        users.add(new User(1,"Amit",25,"amitemail@gmail.com","Admin"));
        users.add(new User(2,"Uma",24,"umaemail@gmail.com","User"));
        users.add(new User(3,"Rajat",27,"rajatemail@gmail.com","User"));
    }

    public List<User> finaAll() {
        return users;
    }

    public User findById(int id) {
        for(User user:users) {
            if(user.getId()==id) return user;
        }
        return null;
    }

    public User deleteById(int id) {
        User deleteduser = null;
        for(int i = 0;i<users.size();i++) {
            if(users.get(i).getId()==id) {
                deleteduser = users.get(i);
                users.remove(i);
                break;

            }
        }
        return deleteduser;
    }

    public User save(User user) {
        if(null == user.getId()) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User setMovieForUser(User user,Movie movie) {
        if(null == user) return null;
        if(null == movie) return user;
        List<Movie> movieList = user.getMovieList();
        if (null == movieList){
            movieList = new ArrayList<>();
        }
        movieList.add(movie);

        user.setMovieList(movieList);
        return user;

    }

}
