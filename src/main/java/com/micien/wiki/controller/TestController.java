package com.micien.wiki.controller;

import com.micien.wiki.domain.Test;
import com.micien.wiki.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class TestController {
    @Value("${mytest.hello}")
    private String private_hello;

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello"+private_hello;
    }

    @RequestMapping("/test/list")
    public List<Test> helloPost(String name){
        return testService.list();
    }
}
