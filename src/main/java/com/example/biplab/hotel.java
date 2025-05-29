package com.example.biplab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class   hotel {

    @GetMapping("/hotel")
    public String getData() {
        return "ITC hotels are good with 20% discunt";
    }
}