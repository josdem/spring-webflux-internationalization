package com.jos.dem.spring.webflux.internationalization.service;

import org.springframework.web.server.ServerWebExchange;

public interface LocaleService {
  String getMessage(String code, ServerWebExchange exchange);
}
