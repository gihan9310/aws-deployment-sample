package com.aws.gihanz.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "welcome")
public class WelcomeController {

    @GetMapping()
    public String welcomeResponse(){

        return "Welcome to AWS.";
    }

    @GetMapping("/{name}")
    public String welcomeResponse(@PathVariable("name")String name){
        return name+" Welcome to AWS.".toUpperCase();
    }
}
