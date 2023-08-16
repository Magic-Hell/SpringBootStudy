package com.magichell.practice.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloworldController {

    @RequestMapping("/world")
    public String sayHi(){
        return "hello world!";
    }

}
