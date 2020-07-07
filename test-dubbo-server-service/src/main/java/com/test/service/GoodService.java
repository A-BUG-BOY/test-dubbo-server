package com.test.service;

import com.test.TGoods;

import java.util.List;

public interface GoodService {
    int insert(TGoods tGoods);
    List<TGoods> select();
}
