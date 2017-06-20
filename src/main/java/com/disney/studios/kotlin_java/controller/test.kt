package com.disney.studios.kotlin_java.controller

import org.springframework.http.HttpRequest
import org.springframework.web.HttpRequestHandler
import javax.servlet.http.HttpServletRequest

class test(val request: HttpServletRequest)  {
    fun getGreeting() : String{
        var x = TestService().getHelloMessage(request)
        println(x)
        x = x + " " + request.method
        return x
    }
}

