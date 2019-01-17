package com.jos.dem.spring.webflux.internationalization.handler;

import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.spring.webflux.internationalization.service.LocaleService;

@RestController
public class InternationalizationController {

  @Autowired
  private LocaleService localeService;

  @GetMapping("/")
  public String index(ServerWebExchange exchange) {
    return localeService.getMessage("user.hello", exchange);
  }

}
