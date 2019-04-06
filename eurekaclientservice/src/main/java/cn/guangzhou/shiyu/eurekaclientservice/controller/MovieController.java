package cn.guangzhou.shiyu.eurekaclientservice.controller;

import cn.guangzhou.shiyu.eurekaclientservice.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {
    private static List<Movie> movieList=new ArrayList<>();
    static {
        movieList.add(new Movie(1,"movie-1","summary-1"));
        movieList.add(new Movie(2,"movie-2","summary-2"));
        movieList.add(new Movie(3,"movie-3","summary-3"));
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getMovies(){
        return ResponseEntity.ok(movieList);
    }
}
