package com.mansoor.Springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @Value("${welcome.message.config}")
    private  String welcomeMessage;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String helloWorld(){
        return "welcome.message.config";
    }
}