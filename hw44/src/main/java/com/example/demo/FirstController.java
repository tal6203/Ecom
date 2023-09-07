package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping(value = "/testme")
    public String testController() {
        return "<h1>Hello Spring!</h1>";
    }
}