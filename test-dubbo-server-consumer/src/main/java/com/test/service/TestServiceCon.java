package com.test.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.TGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: test-dubbos-erver
 * @description:
 * @author: zxb
 * @create: 2020-07-06 23:49
 **/
@Component
public class TestServiceCon {
    @Reference
    TestDemo testDemo;

    @Reference
    GoodService goodService;

    public String test(String word){
        return testDemo.testDemo(word);
    }

    public int TestGoodsService(TGoods tGoods){
       return goodService.insert(tGoods);
    }
}
