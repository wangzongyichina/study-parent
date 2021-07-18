package com.wzy.study.design.proxy.stati;

import com.wzy.study.design.proxy.Interface;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 9:20
 * @Desc:
 */

public class SimpleProxy implements Interface {

    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("simpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("simpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}
