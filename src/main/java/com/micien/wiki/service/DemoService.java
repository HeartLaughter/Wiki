package com.micien.wiki.service;

import com.micien.wiki.domain.Demo;
import com.micien.wiki.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoMapper DemoMapper;

    public List<Demo> list(){
        return DemoMapper.selectByExample(null);

    }
}
