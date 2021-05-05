package com.wzy.study.gateway.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/2 11:29
 * @Desc:
 */

public class ParallelSteamDemo {
    public static void main(String[] args) {
        //创建集合大小为100
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(i);
        }
        //多管道遍历
        List<Integer> integerList = new ArrayList<>();
        integers.parallelStream().forEach(e -> {
            //添加list的方法
            setInteger(integerList, e);
            try {
                //休眠100ms，假装执行某些任务
                Thread.sleep(100);
            }
            catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        });
        System.out.println(integers.size());
        System.out.println(integers);
        System.out.println(integerList.size());
        System.out.println(integerList.stream().filter(Objects::isNull).collect(Collectors.toList()));
        System.out.println(integerList.stream().filter(Objects::nonNull).sorted().collect(Collectors.toList()));
    }


    private static void setInteger(List<Integer> integerList, Integer e) {

        integerList.add(e);

    }

}