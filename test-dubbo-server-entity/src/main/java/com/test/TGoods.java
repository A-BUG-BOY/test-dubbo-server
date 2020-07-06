package com.test;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @program: test-dubbos-erver
 * @description:
 * @author: zxb
 * @create: 2020-07-07 00:16
 **/
@Data
@ToString
public class TGoods implements Serializable {
    private int fId;
    private int goodsId;
    private  String goodName;
    private int goodPrice;
}
