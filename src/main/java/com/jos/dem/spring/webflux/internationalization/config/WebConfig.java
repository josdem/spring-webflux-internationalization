package com.jos.dem.spring.webflux.internationalization.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.reactive.config.ViewResolverRegistry;

@Configuration
@EnableWebFlux
public class WebConfig implements ApplicationContextAware, WebFluxConfigurer {

  private ApplicationContext context;

  @Override
  public void setApplicationContext(ApplicationContext context) {
    this.context = context;
  }

  @Bean
  public MessageSource messageSource() {
    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    messageSource.setBasenames("i18n/messages");
    messageSource.setDefaultEncoding("UTF-8");
    return messageSource;
  }

}
