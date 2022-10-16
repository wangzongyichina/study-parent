package com.wzy.study.datastructure.sort;

import java.util.Arrays;

/**
 * @Author: wangzongyi
 * @Date: 2022/9/10 16:40
 * @Desc:
 */

public class BubbleSort {

    public static void main(String[] args) {
        Integer[] data = {
            12, 3, 345, 6, 1, 90
        };
        System.out.println("排序前：" + Arrays.toString(data));
        sort(data);
        System.out.println("排序后：" + Arrays.toString(data));

    }

    public static void sort(Comparable[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (compare(data[j], data[j + 1])) {
                    swap(data, j, j + 1);
                }
            }
        }

    }

    public static boolean compare(Comparable a, Comparable b) {
        // 从大到小改为 a.compareTo(b) < 0
        return a.compareTo(b) > 0;
    }

    public static void swap(Comparable[] data, int i, int j) {
        Comparable temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
