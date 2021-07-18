package com.wzy.study.design.proxy.stati;

import com.wzy.study.design.proxy.Interface;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 9:17
 * @Desc:
 */

public class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}
