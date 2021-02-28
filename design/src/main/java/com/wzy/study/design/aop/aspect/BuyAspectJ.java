package com.wzy.study.design.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: wangzongyi
 * @Data: 2021/2/28 15:07
 * @Desc:
 */

@Aspect
@Component
public class BuyAspectJ {

    @Before("execution( * com.wzy.study.design.aop.impl.BuyImpl.buy(..))")
    public void haha() {
        System.out.println("每个男孩女孩都喜欢买自己喜欢的东西");
    }
}
