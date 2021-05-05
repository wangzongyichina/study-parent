//package com.wzy.study.gateway.controller.servelt;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//@WebServlet(name = "SyncServlet")
//public class SyncServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        long start = System.currentTimeMillis();
//        doSomeThing(request,response);
//        System.out.println("Synch处理耗时："+(System.currentTimeMillis() - start));
//    }
//
//    private void doSomeThing(HttpServletRequest request, HttpServletResponse response) {
//        try {
//            TimeUnit.SECONDS.sleep(3);
//            response.getWriter().write("done");
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
