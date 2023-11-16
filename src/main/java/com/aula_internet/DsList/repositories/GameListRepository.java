package com.aula_internet.DsList.repositories;

import com.aula_internet.DsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
