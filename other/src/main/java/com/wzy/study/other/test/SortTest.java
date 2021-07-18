package com.wzy.study.other.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: wangzongyi
 * @Data: 2021/7/14 23:46
 * @Desc:
 */

public class SortTest {

    Integer arrays[] = {
        34, 23, 5, 87, 6, 31, 17, 66
    };

    @Test
    public void interSort() {
        for (int i = 0; i < arrays.length - 1; i++) {
            int data = arrays[i + 1];
            int index = i;
            while (index >= 0 && arrays[index] > data) {
                arrays[index + 1] = arrays[index];
                index--;
            }
            arrays[index + 1] = data;
        }
        System.out.println("arrays = " + Arrays.toString(arrays));

    }

    @Test
    public void teset() {
        int[] ints = {
            3, 2, 4
        };
        int[] ints1 = twoSum(ints, 6);
        System.out.println("ints1 = " + Arrays.toString(ints1));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[temp] + nums[j] == target) {
                    return new int[] {
                        temp, j
                    };
                }
            }
        }
        return null;
    }
}
