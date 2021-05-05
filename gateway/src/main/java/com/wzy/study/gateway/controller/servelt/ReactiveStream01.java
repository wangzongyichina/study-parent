package com.wzy.study.gateway.controller.servelt;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

import java.security.PrivateKey;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/3 23:00
 * @Desc:
 */

public class ReactiveStream01 {
    public static void main(String[] args) {

        // reactor = jdk8 stream + jdk9 reactive stream
        // Mono 0-1 个元素
        // Flux 0-N 个元素
        String[] strs = {
            "1", "2", "3"
        };

        // 定义订阅者
        Subscriber<Integer> subscriber = new Subscriber<Integer>() {
            private Subscription subscription;

            @Override
            public void onSubscribe(Subscription subscription) {
                // 保存订阅关系
                this.subscription = subscription;
                // 请求一个数据
                this.subscription.request(1);
            }

            @Override
            public void onNext(Integer integer) {
                // 接受到一个数据，处理
                System.out.println("处理integer = " + integer);
                // 处理完调用的 request 再请求一个数据
                this.subscription.request(1);
                // 或者已经达到处理目标，调用cancel告诉发布者不在接受数据了
                // this.subscription.cancel();
            }

            @Override
            public void onError(Throwable throwable) {
                // 出现异常时的处理，打印异常
                throwable.printStackTrace();
                // 调用cancel告诉发布者不在接受数据了
                 this.subscription.cancel();
            }

            @Override
            public void onComplete() {
                // 调用publisher.close() 方法触发
                System.out.println("处理完成");

            }
        };

        // 这里是jdk8 的stream
        Flux.fromArray(strs).map(s -> Integer.parseInt(s))
            // 最终操作，就是jdk9 的reactive stream
            .subscribe(subscriber);
    }
}
