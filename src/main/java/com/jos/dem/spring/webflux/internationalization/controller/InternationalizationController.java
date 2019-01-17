package com.jos.dem.spring.webflux.internationalization.handler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternationalizationController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

}
