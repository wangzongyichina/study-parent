package com.wzy.study.spring.aop.log;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 16:44
 * @Desc:
 */

public class DIYLog {

    public void before(){
        System.out.println("--------before------");
    }

    public void after(){
        System.out.println("--------after------");
    }

}
