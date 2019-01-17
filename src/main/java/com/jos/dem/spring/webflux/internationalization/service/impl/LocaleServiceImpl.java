package com.jos.dem.spring.webflux.internationalization.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.spring.webflux.internationalization.service.LocaleService;
import com.jos.dem.spring.webflux.internationalization.helper.LocaleResolver;

@Service
public class LocaleServiceImpl implements LocaleService {

  @Autowired
  private MessageSource messageSource;
  @Autowired
  private LocaleResolver localeResolver;

  @Override
  public String getMessage(String code, ServerWebExchange exchange) {
    LocaleContext localeContext = localeResolver.resolveLocaleContext(exchange);
    return messageSource.getMessage(code, null, localeContext.getLocale());
  }

}
