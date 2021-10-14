package com.ppkwu.lab1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevController {

    @GetMapping("/api/rev")
    public String reverseString(@RequestParam(name = "str") String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
