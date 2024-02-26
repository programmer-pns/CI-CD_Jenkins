package com.pns.pipeline;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/health")
    public String healthCheck(){
        return String.format("\"time\":\"%s\"", LocalDateTime.now());
    }

    @GetMapping("/")
    public String home(){
        return "Welcome to Pipeline Page";
    }
}
