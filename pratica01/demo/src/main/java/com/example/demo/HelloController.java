package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    String MeuNome = "Samuel";
    @GetMapping("/test")

    public String hello(){
        return "Hello World! " + MeuNome;
    }

    @GetMapping("/api/hello")
    public String hellonone (String none){
        return "Hello World!" + none;
    }
}
