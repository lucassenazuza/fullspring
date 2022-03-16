package com.project.fullspring.controller;


import com.project.fullspring.domain.Anime;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping("/{id}")
    public String getAnime(@PathVariable String id){
        return "ok";
    }
}
