package com.darkcode.spring.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holacontroller {
    @GetMapping("/")
    String juego(){
        return"Amor y Odio ";
    }
}