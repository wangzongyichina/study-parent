package com.wzy.study.design.pattern.proxy.dynamic;

/**
 * @Author: wangzongyi
 * @Data: 2021/12/4 9:05
 * @Desc:
 */

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDaoImpl();
        ProxyFactory teachProxyFactory = new ProxyFactory(teacherDao);
        TeacherDao teachProxyFactoryProxyInstance = (TeacherDao) teachProxyFactory.getProxyInstance();
        teachProxyFactoryProxyInstance.teach();

        String yuwen = teachProxyFactoryProxyInstance.prepareLessons("语文");
        System.out.println(yuwen);


    }
}
