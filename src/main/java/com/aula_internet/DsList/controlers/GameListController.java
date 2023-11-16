package com.aula_internet.DsList.controlers;

import com.aula_internet.DsList.dto.GameDTO;
import com.aula_internet.DsList.dto.GameListDTO;
import com.aula_internet.DsList.dto.GameMinDTO;
import com.aula_internet.DsList.services.GameListService;
import com.aula_internet.DsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService service;
    @GetMapping
    public List<GameListDTO> fingAll(){
        List<GameListDTO> result = service.findAll();
        return result;
    }
}
