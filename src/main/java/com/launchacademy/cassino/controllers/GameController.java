package com.launchacademy.cassino.controllers;

import com.launchacademy.cassino.models.Game;
import com.launchacademy.cassino.services.GameService;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {
  private GameService gameService;

  @Autowired
  public GameController(GameService gameService) {
    this.gameService = gameService;
  }

  @GetMapping("/{name}")
  public ResponseEntity<Map<String, Game>> getGameByName(@PathVariable String name) {
    Map<String, Game> requestedGame = new HashMap<>();
    Optional<Game> queriedGame = gameService.findByName(name);
    if(queriedGame.isPresent()) {
      requestedGame.put("game", queriedGame.get());
      return new ResponseEntity<Map<String, Game>>(requestedGame, HttpStatus.OK);
    } else {
      return new ResponseEntity<Map<String,Game>>(requestedGame, HttpStatus.NOT_FOUND);
    }
  }
}
