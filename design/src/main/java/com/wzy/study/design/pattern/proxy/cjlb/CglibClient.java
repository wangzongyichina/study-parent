package com.wzy.study.design.pattern.proxy.cjlb;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/4 9:05
 * @Desc:
 */

public class CglibClient {
    public static void main(String[] args) {
        CglibTeacherDao cglibTeacherDao = new CglibTeacherDao();
        CglibProxyFactory teachProxyFactory = new CglibProxyFactory(cglibTeacherDao);
        CglibTeacherDao teachProxyFactoryProxyInstance = (CglibTeacherDao) teachProxyFactory.getProxyInstance();
        teachProxyFactoryProxyInstance.teach();
        System.out.println("--------------------");
        String yuwen = teachProxyFactoryProxyInstance.prepareLessons("语文");
        System.out.println(yuwen);


    }
}
