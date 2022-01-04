package com.wzy.study.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/26 21:18
 * @Desc:
 */

public class CreatePerson {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-aop.xml");
        Object person = applicationContext.getBean("person");
        System.out.println("person = " + person);
        Object person2 = applicationContext.getBean("person");
        System.out.println("person = " + person2);
        System.out.println((person == person2));
    }
}
