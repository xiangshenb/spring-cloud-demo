package com.client.client1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {

    @Value("${test}")
    String val;

    @GetMapping("/test")
    public String hello(){
        return "this hello client1";
    }

    @GetMapping("/getConfig")
    @RefreshScope
    public String getConfig(){
       return val;
    }
}
