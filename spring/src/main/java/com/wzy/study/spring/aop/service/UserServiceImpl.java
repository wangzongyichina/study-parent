package com.wzy.study.spring.aop.service;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 13:49
 * @Desc:
 */

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("新增一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询到了一个用户");

    }

}
