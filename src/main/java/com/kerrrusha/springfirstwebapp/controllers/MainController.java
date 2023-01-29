package com.kerrrusha.springfirstwebapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String getMain() {
        return "Hello Spring!";
    }
}
