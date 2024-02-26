package com.pns.pipeline;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String healthCheck(){
        return String.format("\"time\":\"%s\"", LocalDateTime.now());
    }

}
