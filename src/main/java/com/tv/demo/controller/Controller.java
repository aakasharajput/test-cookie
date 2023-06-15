package com.tv.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public String helloWorld(){
        return "Hello World !";
    }
}