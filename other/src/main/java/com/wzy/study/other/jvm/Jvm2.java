package com.wzy.study.other.jvm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangzongyi
 * @Date: 2023/6/12 0:28
 * @Desc:
 */

public class Jvm2 {

    private static final int _512K = 512 * 1024;

    private static final int _1M = 1024 * 1024;

    private static final int _2M = 2 * 1024 * 1024;

    private static final int _5M = 5 * 1024 * 1024;

    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        List<byte[]> list = new ArrayList<>();
        list.add(new byte[_1M]);
        list.add(new byte[_1M]);
        list.add(new byte[_2M]);
        list.add(new byte[_5M]);
        list.add(new byte[_2M]);
        list.add(new byte[_1M]);
        list.add(new byte[_512K]);
        list.add(new byte[_512K]);
        System.out.println("list.size() = " + list.size());

    }

}
