package com.example.reddis_news_collections.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public static String sayHello(){
        return "Hello";
    }
}
