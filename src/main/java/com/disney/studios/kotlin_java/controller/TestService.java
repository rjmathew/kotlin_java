package com.disney.studios.kotlin_java.controller;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class TestService {
    public String getHelloMessage(HttpServletRequest request) {
        return "Hello - " + request.getRequestURI();
    }
}
