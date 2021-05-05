package com.wzy.study.gateway.lambda;

import java.util.function.Function;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 20:25
 * @Desc:
 */

public class CurryDemo {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> function = x -> y -> z -> x + y + z;
        System.out.println(function.apply(1).apply(2).apply(3));

        int[] ints = {
            2, 3, 4, 5,6
        };
        Function f = function;
        for (int i = 0; i < ints.length; i++) {
            if (f instanceof Function) {
                Object apply = f.apply(ints[i]);
                if (apply instanceof Function) {
                    f = (Function) apply;
                }
                else {
                    System.out.println("结束：" + apply);
                    return;
                }
            }
        }
    }
}
