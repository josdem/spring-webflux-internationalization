package com.jos.dem.spring.webflux.internationalization.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InternationalizationController {

  @GetMapping("/index")
  public String index() {
    return "index";
  }

  @GetMapping("/welcome")
  public String welcome() {
    return "welcome";
  }


}
