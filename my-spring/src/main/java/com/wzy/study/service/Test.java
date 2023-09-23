package com.wzy.study.service;

import com.wzy.study.spring.AppConfig;
import com.wzy.study.spring.WzyApplicationContent;

/**
 * @Author: wangzongyi
 * @Date: 2023/7/2 16:02
 * @Desc:
 */

public class Test {
    public static void main(String[] args) {
        WzyApplicationContent content = new WzyApplicationContent(AppConfig.class);
    }
}
