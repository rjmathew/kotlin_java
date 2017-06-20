package com.disney.studios.kotlin_java.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @Autowired
    HttpServletRequest request;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String findAll() {
    test t = new test(request);
    return t.getGreeting();

  }

}
