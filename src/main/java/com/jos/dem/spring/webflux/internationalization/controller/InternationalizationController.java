package com.jos.dem.spring.webflux.internationalization.controller;

import reactor.core.publisher.Mono;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

@RestController
public class InternationalizationController {

  @GetMapping("/")
  public Mono<ServerResponse> index(ServerRequest request){
    return ServerResponse
      .ok()
      .contentType(MediaType.TEXT_HTML)
      .render("index");
  }

}
