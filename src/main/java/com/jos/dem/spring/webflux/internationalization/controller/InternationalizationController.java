package com.jos.dem.spring.webflux.internationalization.handler;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class InternationalizationController {

  @Autowired
  private MessageSource messageSource;

  @GetMapping("/")
  public String index(ServerWebExchange exchange) {
    return messageSource.getMessage("user.hello", null, Locale.getDefault());
  }

}
