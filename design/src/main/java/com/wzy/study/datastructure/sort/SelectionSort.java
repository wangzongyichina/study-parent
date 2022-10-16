package com.wzy.study.datastructure.sort;

import java.util.Arrays;

/**
 * @Author: wangzongyi
 * @Date: 2022/9/10 16:59
 * @Desc:
 */

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] data = {
            12, 3, 345, 6, 1, 90
        };
        System.out.println("排序前：" + Arrays.toString(data));
        sort(data);
        System.out.println("排序后：" + Arrays.toString(data));
    }

    public static void sort(Comparable[] data) {

        int min = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (compare(data[min], data[j])) {
                    min = j;
                }
            }
            swap(data, min, i);
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
