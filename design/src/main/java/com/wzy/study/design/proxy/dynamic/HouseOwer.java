package com.wzy.study.design.proxy.dynamic;

import com.wzy.study.design.proxy.Rent;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/27 18:31
 * @Desc:
 */

public class HouseOwer implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
