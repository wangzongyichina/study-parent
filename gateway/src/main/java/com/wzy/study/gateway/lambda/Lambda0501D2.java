package com.wzy.study.gateway.lambda;

import java.util.function.DoubleToIntFunction;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/1 16:41
 * @Desc:
 */

public class Lambda0501D2 {
    public static void main(String[] args) {
        Interface0501D1 i012 = i -> i * 2;
        System.out.println(i012);
    }
}
