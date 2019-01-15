package com.jos.dem.spring.webflux.internationalization.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.reactive.config.DelegatingWebFluxConfiguration;

@Configuration
public class LocaleSupportConfig extends DelegatingWebFluxConfiguration {

  @Override
  protected LocaleContextResolver createLocaleContextResolver() {
    return new LocaleResolver();
  }

}
