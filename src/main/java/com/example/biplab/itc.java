package com.example.biplab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  itc {

    @GetMapping("/itc")
    public String getData() {
        return "creating a new itc.java";
    }
}