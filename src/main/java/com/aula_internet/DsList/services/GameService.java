package com.aula_internet.DsList.services;

import com.aula_internet.DsList.dto.GameDTO;
import com.aula_internet.DsList.dto.GameMinDTO;
import com.aula_internet.DsList.entities.Game;
import com.aula_internet.DsList.projections.GameMinProjection;
import com.aula_internet.DsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameService {
    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO fingById(Long id) {
        Optional<Game> result = repository.findById(id);
        if (result.isPresent()) {
            Game game = result.get();
            return new GameDTO(game);
        }
        return null;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = repository.searchByList(listId);
        return result.stream().map(x-> new GameMinDTO(x)).toList();
    }

}
