package com.ppkwu.lab1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevController {

    @GetMapping("/api/test")
    public String test(){
        return "test";
    }
}
