package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//siempre que es controlador se usa el restcontroller
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello";
    }


}

