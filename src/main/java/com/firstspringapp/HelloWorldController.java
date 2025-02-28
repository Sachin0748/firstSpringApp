package com.firstspringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    // UC_01
    @GetMapping("/hello1")
    public String sayHello1(){
        return "Hello from BridgeLabz";
    }

    // UC_02
    @GetMapping("/hello2")
    public String sayHello2(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello"; // This refers to the Thymeleaf template (hello.html)
    }

    // UC_03
    @GetMapping("/hello3")
    public String sayHello3(){
        return "Hello from BridgeLabz";
    }

    // UC_04
    @GetMapping("/hello4")
    public String sayHello4(){
        return "Hello from BridgeLabz";
    }
}
