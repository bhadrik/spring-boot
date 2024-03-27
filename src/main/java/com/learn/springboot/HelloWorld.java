package com.learn.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    
    @RequestMapping("/test")
    public String HelloMessage() {
        return new String("Hello World");
    }
}
