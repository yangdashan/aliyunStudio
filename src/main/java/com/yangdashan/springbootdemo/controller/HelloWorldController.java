package com.yangdashan.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @RequestMapping("/getWorld")
    public String getWorldName() {
        return "三体世界！";
        
    }
    
}
