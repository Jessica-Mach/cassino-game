package com.launchacademy.cassino.services;

import com.launchacademy.cassino.models.Game;
import com.launchacademy.cassino.repositories.GameRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
  private GameRepository gameRepository;

  @Autowired
  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  public Optional<Game> findByName(String name) {
    return this.gameRepository.findByName(name);
  }
}
