package com.wzy.study.other.effectivejava.exercise17;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/29 23:30
 * @Desc:
 */

public class Exercise17 {
    public static void main(String[] args) {
        InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<>();
        instrumentedHashSet.addAll(Arrays.asList("aa","bb","cc"));
        System.out.println("instrumentedHashSet.getAddCount() = " + instrumentedHashSet.getAddCount());

        HashSet<String> hashSet = new HashSet<>();
        ImproveInstrumentedHashSet<String> improve = new ImproveInstrumentedHashSet<>(hashSet);
        improve.addAll(Arrays.asList("aa","bb","cc"));
        System.out.println("improve.getAddCount() = " + improve.getAddCount());
    }
}
