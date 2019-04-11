package cn.guangzhou.shiyu.eurekaclientservice.controller;

import cn.guangzhou.shiyu.eurekaclientservice.model.Movie;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {
    private static Logger log= LoggerFactory.getLogger(MovieController.class);

    private static List<Movie> movieList=new ArrayList<>();
    static {
        movieList.add(new Movie(1,"movie-1","summary-1"));
        movieList.add(new Movie(2,"movie-2","summary-2"));
        movieList.add(new Movie(3,"movie-3","summary-3"));
    }


    @GetMapping("/")
    public String home(){
        log.info("home,不让ribbon报错");
        return "Hi";
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getMovies(){
        return ResponseEntity.ok(movieList);
    }
}
