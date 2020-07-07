package com.test.web;

import com.test.TGoods;
import com.test.service.TestServiceCon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: test-dubbos-erver
 * @description:
 * @author: zxb
 * @create: 2020-07-06 23:51
 **/
@RestController
public class TestController {
    @Autowired
    TestServiceCon testServiceCon;

    @RequestMapping("/test")
    public String test(){
        return testServiceCon.test("Hello world");
    }

    @RequestMapping("/insert")
    public int testInsert(){
        TGoods tGoods = new TGoods();
        tGoods.setGoodsId(1);
        tGoods.setGoodsName("三星");
        tGoods.setGoodsPrice(100);
        return testServiceCon.TestGoodsService(tGoods);
    }

    @RequestMapping("/testGenerService")
    public String testGenerService(){
        return testServiceCon.testGenerService();
    }

    @RequestMapping("/select")
    public List<TGoods> select(){
      return  testServiceCon.select();
    }
}
