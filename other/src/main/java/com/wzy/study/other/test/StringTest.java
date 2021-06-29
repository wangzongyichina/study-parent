package com.wzy.study.other.test;

import org.junit.Test;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/23 20:26
 * @Desc:
 */

public class StringTest {

    @Test
    public void test01() {
        String str = "lj.l.jpg";
        System.out.println(str.substring(str.lastIndexOf(".")));
    }

}
