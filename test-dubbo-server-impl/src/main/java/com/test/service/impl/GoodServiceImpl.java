package com.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.TGoods;


import com.test.dao.TGoodsMapper;
import com.test.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: test-dubbos-erver
 * @description:
 * @author: zxb
 * @create: 2020-07-07 01:17
 **/
@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    TGoodsMapper tgoodsMapper;

    @Override
    public int insert(TGoods tGoods) {
        return tgoodsMapper.testInsert(tGoods);
    }
    @Override
    public List<TGoods> select(){
        return tgoodsMapper.testSelect();
    }
}
