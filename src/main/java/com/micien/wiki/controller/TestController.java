package com.micien.wiki.controller;

import com.micien.wiki.domain.Test;
import com.micien.wiki.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
class TestController {

    @Resource
    private TestService testService;



    @RequestMapping("/list")
    public List<Test> helloPost(String name){
        return testService.list();
    }
}
