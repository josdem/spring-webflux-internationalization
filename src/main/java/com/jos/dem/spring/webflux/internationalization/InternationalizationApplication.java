package com.jos.dem.spring.webflux.internationalization;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class InternationalizationApplication {

  public static void main(String[] args) {
    SpringApplication.run(InternationalizationApplication.class, args);
  }

  @Bean
  public MessageSource messageSource() {
    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    messageSource.setBasenames("languages/i18n");
    messageSource.setDefaultEncoding("UTF-8");
    return messageSource;
  }

}

