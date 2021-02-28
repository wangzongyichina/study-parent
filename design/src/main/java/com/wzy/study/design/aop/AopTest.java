package com.wzy.study.design.aop;

import com.wzy.study.design.aop.config.AppConfig;
import com.wzy.study.design.aop.enter.Boy;
import com.wzy.study.design.aop.enter.Girl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.security.PublicKey;
import java.util.Objects;

/**
 * @Author: wangzongyi
 * @Data: 2021/2/28 14:43
 * @Desc:
 */

@Controller
public class AopTest {

    @Autowired
    private Boy boy;

    @Autowired
    private Girl girl;

    @GetMapping("test1")
    @ResponseBody
    public void test(){
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Boy boy = context.getBean("boy", Boy.class);
//        Girl girl = (Girl) context.getBean("girl");

        System.out.println("boy = " + boy);
        if (Objects.isNull(boy)){
            boy = new Boy();
            System.out.println("初始化boy");
        }
        if (Objects.isNull(girl)){
            girl = new Girl();
            System.out.println("初始化girl");
        }
        boy.buy();
        girl.buy();
        return;
    }

    @Test
    public void test1(){
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Boy boy = context.getBean("boy", Boy.class);
//        Girl girl = (Girl) context.getBean("girl");

        System.out.println("boy = " + boy);
        if (Objects.isNull(boy)){
            boy = new Boy();
            System.out.println("初始化boy");
        }
        if (Objects.isNull(girl)){
            girl = new Girl();
            System.out.println("初始化girl");
        }
        boy.buy();
        girl.buy();
    }

}
