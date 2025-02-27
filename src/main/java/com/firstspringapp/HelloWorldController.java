package com.firstspringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    // UC_01
    @GetMapping("/hello1")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
