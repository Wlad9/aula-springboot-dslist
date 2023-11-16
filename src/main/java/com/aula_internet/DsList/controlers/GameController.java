package com.aula_internet.DsList.controlers;

import com.aula_internet.DsList.dto.GameDTO;
import com.aula_internet.DsList.dto.GameMinDTO;
import com.aula_internet.DsList.entities.Game;
import com.aula_internet.DsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService service;
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = service.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = service.fingById(id);
        return result;
    }
}
