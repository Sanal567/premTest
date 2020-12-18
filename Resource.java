package com.kumar.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    @GetMapping("/")
    public String hi() {
        return "hi";
    }

    @GetMapping("/hi")
    public String hi2(){
        return "second hi";
    }

}
