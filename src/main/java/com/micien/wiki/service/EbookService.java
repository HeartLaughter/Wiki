package com.micien.wiki.service;

import com.micien.wiki.domain.Ebook;
import com.micien.wiki.domain.EbookExample;
import com.micien.wiki.mapper.EbookMapper;
import com.micien.wiki.req.EbookReq;
import com.micien.wiki.resp.EbookResp;
import com.micien.wiki.util.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {
    @Autowired
    private EbookMapper EbookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebooklist = EbookMapper.selectByExample(ebookExample);

/*        List<EbookResp> respslist = new ArrayList<>();
        for (Ebook ebook : ebooklist) {
*//*            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);*//*
            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
            respslist.add(ebookResp);
        }*/

        List<EbookResp> ebookResps = CopyUtil.copyList(ebooklist, EbookResp.class);
        return ebookResps;
    }
}
