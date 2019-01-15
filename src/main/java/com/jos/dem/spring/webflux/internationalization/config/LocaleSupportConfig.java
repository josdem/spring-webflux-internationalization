package com.jos.dem.spring.webflux.internationalization.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.i18n.LocaleContextResolver;
import org.springframework.web.reactive.config.DelegatingWebFluxConfiguration;

import com.jos.dem.spring.webflux.internationalization.helper.LocaleResolver;

@Configuration
public class LocaleSupportConfig extends DelegatingWebFluxConfiguration {

  @Override
  protected LocaleContextResolver createLocaleContextResolver() {
    return new LocaleResolver();
  }

}
