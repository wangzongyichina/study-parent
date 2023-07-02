package com.wzy.study.other.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangzongyi
 * @Date: 2022/10/16 15:14
 * @Desc:
 */

public class CallableAndFuture {

    public static ExecutorService executorService = new ThreadPoolExecutor(4, 40, 60, TimeUnit.MILLISECONDS,
        new LinkedBlockingDeque<Runnable>(1024), new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build(),
        new ThreadPoolExecutor.AbortPolicy());

    static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(3000);
            return "异步处理的返回结果";
        }
    }

    public static void main(String[] args) {
        Future<String> submit = executorService.submit(new MyCallable());
        try {

            String s = submit.get();
            System.out.println("s = " + s);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }

        //new FutureTask<>()

    }

}
