package com.wzy.study.gateway.lambda;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/3 15:16
 * @Desc:
 */

import java.util.Random;
import java.util.stream.Stream;

/**
 * 1.验证stream 运行机制 所有的操作时链式调用。
 * 2.一个元素值迭代一次 每一个中间操作返回一个新的流，流里有一个 sourceStage 指向同一个地方- Head。
 * 3.Head -> nextStage->nextStage->......->null
 * 4.有状态的操作会把无状态的操作截断，单独处理。有状态操作：有两个入参，  无状态操作：一个操作
 * 5.并行环境下，有状态的中间操作（比如排序）不一定能并行操作
 * 6.parallel/sequential 这两个也是中间操作（返回stream），但是他们不创建流，他们只修改Head的并行标志
 */

public class StreamRun {
    public static void main(String[] args) {
        Random random = new Random();
        Stream<Integer> integerStream = Stream.generate(() -> random.nextInt()).limit(100)
            // 无状态操作
            .peek(s -> System.out.println(Thread.currentThread().getName() + "第一个peek:" + s))
            // 有状态操作
            .sorted((x, y) -> {
                System.out.println(Thread.currentThread().getName() + "排序");
                return x.compareTo(y);
            })
            // 无状态操作
            .filter(s -> {
                System.out.println(Thread.currentThread().getName() + "filter:" + s);
                return s > 100000;
            })
                .parallel();
        integerStream.count();

    }
}
