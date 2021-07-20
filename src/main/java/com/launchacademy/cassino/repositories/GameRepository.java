package com.launchacademy.cassino.repositories;

import com.launchacademy.cassino.models.Game;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Integer> {
  Optional<Game> findByName(String name);
}
