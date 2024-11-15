package com.balu.BookApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class helloworld {
    @GetMapping("/greet")
    public String greet() {
        return "Hello world...!";
    }
}
