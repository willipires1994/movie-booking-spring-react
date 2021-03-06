package com.movie.booking.api.controller;

import com.movie.booking.api.model.AuditoriumModel;
import com.movie.booking.api.model.GenreModel;
import com.movie.booking.api.service.AuditoriumService;
import com.movie.booking.api.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@CrossOrigin
@RestController
@RequestMapping("/api/genres")
@AllArgsConstructor
public class GenreController {

    private final GenreService genreService;

    //Request GET : /api/genres
    @GetMapping
    public Collection<GenreModel> getGenres (){
        return genreService.getGenres();
    }

    //Request POST : /api/genres
    @PostMapping
    public GenreModel addAuditorium(@RequestBody GenreModel genreModel){
        return genreService.addGenre(genreModel);
    }

    //Request DELETE : /api/genres
    @DeleteMapping("/{id}")
    public void removeAuditorium(@PathVariable("id") Long id){
        genreService.removeGenre(genreService.getGenre(id));
    }

}
