package com.wzy.study.design.test;

import com.wzy.study.design.id.IdGeneratorOld;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/6 15:44
 * @Desc:
 */

public class Test {
    public static void main(String[] args) {
        String id = IdGeneratorOld.generate();
        System.out.println("id = " + id);
    }
}
