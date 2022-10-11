package com.example.movieinfoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movieinfo")
public class MovieInfoService {

    @GetMapping("/{movieId}")
    public List<Movie> getMovieInfos(@PathVariable("movieId") String id) {
        return Collections.singletonList(new Movie("test0","1"));
    }



    }

