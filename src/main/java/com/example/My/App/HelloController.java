package com.example.My.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HelloController {

    @GetMapping("/hello") // mapping is simply url routing like react router
    public String sayHello(){
        return "Hello, Spring Boot! My Name is Eric Medina";
    }
}
