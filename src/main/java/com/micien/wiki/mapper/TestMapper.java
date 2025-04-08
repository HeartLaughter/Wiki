package com.micien.wiki.mapper;

import com.micien.wiki.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestMapper {
    public List<Test> list();
}

