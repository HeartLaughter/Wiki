package com.micien.wiki.controller;

import com.micien.wiki.domain.Ebook;
import com.micien.wiki.resp.CommonResp;
import com.micien.wiki.service.EbookService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
class EbookController {

    @Resource
    private EbookService ebookService;

    @RequestMapping("/list")
    public CommonResp list(){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        return resp;
    }
}
