package com.cinema.movie.controller;

import com.cinema.movie.model.Local;
import com.cinema.movie.service.implementation.LocalServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("local")
public class LocalController {

    @Autowired
    LocalServiceImplementation localServiceImplementation;

    @GetMapping
    public List<Local> getAllLocal(){
        return localServiceImplementation.getAllLocals();
    }

    @PostMapping
    public String saveLocal(@RequestBody Local local){
        return localServiceImplementation.saveLocal(local);
    }
}
