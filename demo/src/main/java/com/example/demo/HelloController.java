package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @GetMapping("/jejunu")
//    public String index(){
//        return "Greetings from Spring Boot!";
//    }
    @RequestMapping("")
    public String hello() {
        //TODO: 구현해야함
        return "Hello world!";
    }
}
