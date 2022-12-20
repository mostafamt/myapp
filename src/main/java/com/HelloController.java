package com;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
    @GetMapping("/hello")
    public String hello() {
        String message = "Hello Railway!";
       
        return message;
    }
 
}