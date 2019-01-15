package com.jos.dem.spring.webflux.internationalization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.ServerRequest;

@RestController
public class InternationalizationController {

  @GetMapping("/")
  public String index(ServerRequest request){
    return localeService.getMessage("user.hello", request);
  }

}
