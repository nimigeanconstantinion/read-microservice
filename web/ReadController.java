package com.example.read.web;

import com.example.read.model.MapArt;
import com.example.read.repository.MapArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/read")
@CrossOrigin

public class ReadController {
    @Autowired
    private MapArtRepository mapArtRepository;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<MapArt> getMapStoc() {

        return mapArtRepository.findAll();
    }
}
