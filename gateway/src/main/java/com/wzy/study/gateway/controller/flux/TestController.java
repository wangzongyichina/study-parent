package com.wzy.study.gateway.controller.flux;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/4 13:41
 * @Desc:
 */

@RestController
@Slf4j
public class TestController {
    int i = 0;

    @GetMapping("/get1")
    public String get1() {
        log.info("String--start:{}");
        long start = System.currentTimeMillis();
        String result = doSomething();
        log.info("String--end:{}", (System.currentTimeMillis() - start));
        return result;
    }

    @GetMapping("/get2")
    public Mono<String> get2() {
        log.info("Mono<String>--start:{}");
        long start = System.currentTimeMillis();
        Mono<String> result = Mono.fromSupplier(() -> doSomething());
        log.info("Mono<String>--end:{}", (System.currentTimeMillis() - start));
        return result;
    }

    @GetMapping(value = "get3",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> get3() {
        log.info("Flux-start:{}");
        long start = System.currentTimeMillis();
        Flux<String> result = Flux.fromStream(IntStream.rangeClosed(1, 5).mapToObj(i -> {
            System.out.println(i);
            try {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Flux-date:" + i ;
        }));
        log.info("Flux-end:{}", (System.currentTimeMillis() - start));
        return result;
    }

    private String doSomething() {
        try {
            // 模拟耗时操作
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "something done" + i++;
    }

}
