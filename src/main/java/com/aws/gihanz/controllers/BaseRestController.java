package com.aws.gihanz.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("")
public class BaseRestController {

    @GetMapping(value = "")
    public String start(){

        log.info("Calling........................{START}");
        return "Your Application is Start.";
    }
}
