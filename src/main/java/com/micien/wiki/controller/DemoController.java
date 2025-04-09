package com.micien.wiki.controller;

import com.micien.wiki.domain.Demo;
import com.micien.wiki.service.DemoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/list")
    public List<Demo> helloPost(String name){
        return demoService.list();
    }
}
