package com.launchacademy.cassino.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @GetMapping(value = {"/game"})
  public String forward() {
    return "forward:/";
  }
}
