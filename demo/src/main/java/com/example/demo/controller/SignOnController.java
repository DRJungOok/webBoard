package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class SignOnController {
    @GetMapping("/signOn")
    public String signOn() {
        return "signOn.html";
    }
}