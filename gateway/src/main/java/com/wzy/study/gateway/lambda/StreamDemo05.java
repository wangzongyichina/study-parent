package com.wzy.study.gateway.lambda;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/3 11:13
 * @Desc:
 */

public class StreamDemo05 {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1,100).peek(StreamDemo05::debug).count();
        // 并行流
//        IntStream.rangeClosed(1,100).parallel().peek(StreamDemo05::debug).count();

        //想是想 先并行、后串行效果：实际是，只有后面的串行起了效果，无法达到先并行、后串行的效果
//        IntStream.range(1,100)
//                // 产生并行流
//                .parallel().peek(StreamDemo05::debug)
//                // 产生串行流
//                .sequential().peek(StreamDemo05::debug2)
//                .count();

        /**
         * 并行流使用的线程池是 ForkJoinPool.commonPool
         * 默认的线程次数量是 当前机器的 cpu 个数
         * 使用下面的属性，可以修改默认的线程池数量
         * */
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","30");
        IntStream.rangeClosed(1,100).parallel().peek(StreamDemo05::debug).count();

        System.out.println("---------new pool----------");
        // 使用自己创建的线程池，可以防止任务被阻塞
        ForkJoinPool pool = new ForkJoinPool(20);
        pool.submit(()->IntStream.range(1,100).parallel()
        .peek(StreamDemo05::debug).count());
        pool.shutdown();

        synchronized (pool){
            try {
                pool.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void debug(int num){
        System.out.println(Thread.currentThread().getName()+"debug:" + num);
//        Thread.sleep(100);
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void debug2(int num){
        System.err.println(Thread.currentThread().getName()+"debug2:" + num);
//        Thread.sleep(100);
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
