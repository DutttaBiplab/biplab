package com.example.biplab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @GetMapping("/flights")
    public String getData() {
        return "Biplab learn devops from scratch";
    }
}