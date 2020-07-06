package com.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.TGoods;
import com.test.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: test-dubbos-erver
 * @description:
 * @author: zxb
 * @create: 2020-07-07 01:17
 **/
@Service
public class GoodServiceImpl implements GoodService {

    @Override
    public int insert(TGoods tGoods) {
        return 0;
    }
}
