package com.test.service;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.GenericService;
import com.test.TGoods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: test-dubbos-erver
 * @description:
 * @author: zxb
 * @create: 2020-07-06 23:49
 **/
@Component
@Slf4j
public class TestServiceCon {

    ApplicationContext applicationContext;
    @Reference
    TestDemo testDemo;

    @Reference
    GoodService goodService;

    public String test(String word){
        return testDemo.testDemo(word);
    }

    /**
     * dubbo 泛化调用 api 实现
     * @return
     */
    public String testGenerService(){
        log.info("引用远程服务！该实例很重量，里面封装了所有与注册中心及服务提供方连接，请缓存");
        GenericService  genericService = (GenericService) applicationContext.getBean("testDemo");
        Object testDemo = genericService.$invoke("testDemo", new String[]{"java.lang.String"}, new Object[]{"我的天a"});
        return testDemo.toString();
    }

   public int TestGoodsService(TGoods tGoods){
       return goodService.insert(tGoods);
    }

    public List<TGoods> select(){
        return goodService.select();
    }
}
