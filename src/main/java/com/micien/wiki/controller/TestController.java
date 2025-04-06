package com.micien.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${mytest.hello}")
    private String private_hello;

    @RequestMapping("/hello")
    public String hello(){
        return "hello"+private_hello;
    }

    @RequestMapping("/hello/post")
    public String helloPost(String name){
        return ("hello with Post method" + name);
    }
}
