package com.micien.wiki.controller;

import com.micien.wiki.req.EbookReq;
import com.micien.wiki.resp.CommonResp;
import com.micien.wiki.resp.EbookResp;
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
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
