package com.cinema.movie.service.implementation;

import com.cinema.movie.model.Local;
import com.cinema.movie.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImplementation {

    @Autowired
    LocalRepository localRepository;

    public List<Local> getAllLocals(){
        return localRepository.findAll();
    }

    public String saveLocal(Local local){
        localRepository.save(local);
        return "local was saved";
    }



}
