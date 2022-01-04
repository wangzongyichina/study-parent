package com.wzy.study.design.pattern.stratagy;

import java.util.Arrays;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/30 19:06
 * @Desc:
 */

public class JDKStrategy {
    public static void main(String[] args) {
        Integer[] integers = {
            12, 34, 12, 234, 45, 562, 32, 1, 6, 23
        };

        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers, (i1, i2) -> {
            if (i1.compareTo(i2) > 0) {
                return 1;
            }
            else {
                return -1;
            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
