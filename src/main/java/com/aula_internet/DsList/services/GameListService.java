package com.aula_internet.DsList.services;

import com.aula_internet.DsList.dto.GameListDTO;
import com.aula_internet.DsList.dto.GameMinDTO;
import com.aula_internet.DsList.entities.GameList;
import com.aula_internet.DsList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameListService {
    @Autowired
    private GameListRepository repository;
    public List<GameListDTO> findAll(){
        List<GameList> result = repository.findAll();
        return result.stream().map(x->new GameListDTO(x)).toList();
    }
}
