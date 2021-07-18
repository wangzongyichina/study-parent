package com.wzy.study.spring.aop.main;

import com.wzy.study.spring.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/3 14:17
 * @Desc:
 */

public class AopTest {
    // AOP 实现方式一
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("application-aop.xml");
        UserService userService = (UserService)application.getBean("userService");
        userService.add();
    }
}
