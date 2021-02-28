package com.wzy.study.design.aop.enter;

import com.wzy.study.design.aop.impl.BuyImpl;
import org.springframework.stereotype.Component;

/**
 * @Author: wangzongyi
 * @Data: 2021/2/28 12:41
 * @Desc:
 */

@Component("girl")
public class Girl implements BuyImpl {

    @Override
    public String buy() {
        System.out.println("女孩买了一条裙子");
        return "裙子";
    }

}
