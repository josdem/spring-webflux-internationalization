package com.jos.dem.spring.webflux.internationalization.service.impl;

import java.util.Locale;

import org.springframework.stereotype.Service;
import org.springframework.context.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.spring.webflux.internationalization.service.LocaleService;

@Service
public class LocaleServiceImpl implements LocaleService {

  @Autowired
  private MessageSource messageSource;

  public String getMessage(String code){
    return messageSource.getMessage(code, null, new Locale("en"));
  }

}
