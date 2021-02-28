package com.wzy.study.design.principle;

public class UserServiceTest extends TestCase {
    @Override
    public boolean doTest() {
        // ...
        long round = Math.round(Math.random() * 10);
        System.out.println("round = " + round);
        if (round % 2 == 1) {
            return false;
        }
        return true;
    }
}

//// 注册操作还可以通过配置的方式来实现，不需要程序员显示调用register()
// JunitApplication.register(new UserServiceTest();