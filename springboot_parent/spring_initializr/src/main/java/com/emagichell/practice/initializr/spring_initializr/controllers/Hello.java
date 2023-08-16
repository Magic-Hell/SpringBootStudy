package com.emagichell.practice.initializr.spring_initializr.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/world")
    public String sayHI(){
        return "magu";
    }

}
