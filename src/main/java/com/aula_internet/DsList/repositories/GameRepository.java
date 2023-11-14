package com.aula_internet.DsList.repositories;

import com.aula_internet.DsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
}
