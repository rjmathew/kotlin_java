package com.disney.studios.kotlin_java.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpRequest
import org.springframework.web.HttpRequestHandler
import javax.servlet.http.HttpServletRequest

class test(val request: HttpServletRequest)  {

    @Autowired
    lateinit var testService : TestService

    fun getGreeting() : String{
        var x = testService.getHelloMessage(request)
        println(x)
        x = x + " " + request.method
        return x
    }
}

