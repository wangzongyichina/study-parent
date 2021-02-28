package com.wzy.study.design.aop.enter;

import com.wzy.study.design.aop.impl.BuyImpl;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: wangzongyi
 * @Data: 2021/2/28 12:39
 * @Desc:
 */

@Component
public class Boy implements BuyImpl {

    @Override
    public String buy() {
        System.out.println("男孩买了一个游戏机");
        return "游戏机";
    }

}
