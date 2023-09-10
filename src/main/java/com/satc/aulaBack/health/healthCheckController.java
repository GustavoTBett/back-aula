package com.satc.aulaBack.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}