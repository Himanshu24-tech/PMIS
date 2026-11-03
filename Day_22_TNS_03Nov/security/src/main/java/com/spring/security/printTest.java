package com.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class printTest {

    @GetMapping("/hi")
    public String hi() {
        return "Hi Himanshu";
    }

    @GetMapping("/Hello")
    public String hello() {
        return "Hello Himanshu";
    }

    @GetMapping("/hallo")
    public String hallo() {
        return "Hallo, wie gehts?";
    }
}