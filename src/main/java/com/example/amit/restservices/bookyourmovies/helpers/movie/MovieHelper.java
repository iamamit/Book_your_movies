package com.example.amit.restservices.bookyourmovies.helpers.movie;

import com.example.amit.restservices.bookyourmovies.entities.movie.Movie;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Base64;
import java.util.Locale;

public class MovieHelper {

    public void saveImageInMovie(Movie movie) throws Exception {
        if(null == movie) throw new Exception("Please provide valide movie. NULL was given");
        String imageName = movie.getName();
        imageName = imageName.toLowerCase();
        String folder = "C:\\Users\\uma13\\Downloads\\book-your-movies\\src\\main\\resources\\static\\images\\movies\\"+imageName+".jpg";
        FileInputStream inputStream = new FileInputStream(folder);
        byte[] imageByte = new byte[inputStream.available()];
        inputStream.read(imageByte);
        String poster = Base64.getEncoder().encodeToString(imageByte);
        movie.setPoster(poster);

    }

    public void byteToMoviePoster(Movie movie) throws Exception {
        if(null == movie) throw new Exception("Please provide valide movie. NULL was given");

        String poster = movie.getPoster();
        if(null == poster) return;

        byte[] imageByte = Base64.getDecoder().decode(poster);
        ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
        BufferedImage bImage2 = ImageIO.read(bis);
        String outputImage = movie.getName().toLowerCase();
        String outputImageFile = "C:/Users/uma13/Documents/projects/book-your-movies-client/src/assets/image/movies"+outputImage+".jpg";
        ImageIO.write(bImage2, "jpg", new File(outputImageFile) );
        System.out.println("image created");

        movie.setPoster(outputImageFile);

    }
}
