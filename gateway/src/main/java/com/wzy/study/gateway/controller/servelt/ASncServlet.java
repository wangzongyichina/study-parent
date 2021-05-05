//package com.wzy.study.gateway.controller.servelt;
//
//import javax.servlet.AsyncContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.TimeUnit;
//
//@WebServlet(name = "ASncServlet")
//public class ASncServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//        throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//        throws ServletException, IOException {
//        long start = System.currentTimeMillis();
//        // 开启异步
//        AsyncContext asyncContext = request.startAsync();
//        CompletableFuture
//            .runAsync(() -> doSomeThing(asyncContext, asyncContext.getRequest(), asyncContext.getResponse()));
//        System.out.println("Asynch处理耗时：" + (System.currentTimeMillis() - start));
//    }
//
//    private void doSomeThing(AsyncContext asyncContext, ServletRequest request, ServletResponse response) {
//        try {
//            // 模拟耗时
//            TimeUnit.SECONDS.sleep(3);
//            // 返回响应
//            response.getWriter().write("done");
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        // 业务代码处理完毕，通知结束
//        asyncContext.complete();
//    }
//
//}
