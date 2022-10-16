package com.wzy.study.datastructure.sort;

import java.util.Arrays;

/**
 * @Author: wangzongyi
 * @Date: 2022/9/10 17:42
 * @Desc:
 */

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] data = {
            12, 3, 345, 6, 1, 90
        };
        System.out.println("排序前：" + Arrays.toString(data));
        sort(data);
        System.out.println("排序后：" + Arrays.toString(data));
    }

    public static void sort(Comparable[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (compare(data[j - 1], data[j])) {
                    swap(data, j - 1, j);
                }
            }
        }
    }

    public static boolean compare(Comparable i, Comparable j) {
        return i.compareTo(j) > 0;
    }

    public static void swap(Comparable[] data, int i, int j) {
        Comparable temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;

    }

}
