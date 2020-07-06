package com.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.service.TestDemo;

/**
 * @program: test-dubbos-erver
 * @description:
 * @author: zxb
 * @create: 2020-07-06 22:43
 **/
@Service
public class TestDemoImpl implements TestDemo {
    public String testDemo(String word) {
        return word;
    }
}
