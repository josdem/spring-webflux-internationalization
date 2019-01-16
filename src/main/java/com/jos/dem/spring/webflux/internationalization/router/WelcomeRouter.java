package com.jos.dem.spring.webflux.internationalization.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.jos.dem.spring.webflux.internationalization.handler.WelcomeHandler;

@Configuration
public class WelcomeRouter {

  @Bean
  public RouterFunction<ServerResponse> route(WelcomeHandler welcomeHandler) {

    return RouterFunctions
      .route(RequestPredicates.GET("/index")
          .and(RequestPredicates.accept(MediaType.TEXT_HTML)), welcomeHandler::hello)
      .andRoute(RequestPredicates.GET("/welcome")
          .and(RequestPredicates.accept(MediaType.TEXT_HTML)), welcomeHandler::welcome);
  }
}
