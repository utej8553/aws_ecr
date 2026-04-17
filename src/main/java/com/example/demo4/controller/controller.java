package com.example.demo4.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class controller {
    @GetMapping("/home")
    String func1(){
        return "You have just visited /home6767";
    }

    @GetMapping("/end")
    String func2(){
        return "You have just visited /end";
    }
}
