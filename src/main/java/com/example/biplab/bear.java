package com.example.biplab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  bear {

    @GetMapping("/bear")
    public String getData() {
        return "tubork price is 180 8% aclohol it is very good";
    }
}