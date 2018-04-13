package com.client.client10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/test")
    public String hello(){
        return "this is hello client10";
    }
}
