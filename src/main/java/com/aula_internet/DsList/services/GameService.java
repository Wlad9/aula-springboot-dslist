package com.aula_internet.DsList.services;

import com.aula_internet.DsList.dto.GameMinDTO;
import com.aula_internet.DsList.entities.Game;
import com.aula_internet.DsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {
    @Autowired
    private GameRepository repository;
    public List<GameMinDTO> findAll(){
        List<Game> result = repository.findAll();
        List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
        return dto;
    }
}
