package org.example.projetdevoir.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/dev")
    public String helloDev(){
        return "Hello Dev";
    }

    @GetMapping("/dev-yasser")
    public String helloDevYasser(){
        return "hello from dev yasser";
    }
}
