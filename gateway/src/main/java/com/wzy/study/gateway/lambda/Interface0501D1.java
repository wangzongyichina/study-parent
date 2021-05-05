package com.wzy.study.gateway.lambda;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/1 16:37
 * @Desc:
 */

@FunctionalInterface
public interface Interface0501D1 {
    int integerNum(int i);

    default int add(int a,int b){
        return a+b;
    }

}


@FunctionalInterface
 interface Interface0501D2 {
    int integerNum(int i);

    default int add(int a,int b,int c){
        return a+b;
    }

}


@FunctionalInterface
interface Interface0501D3 extends Interface0501D1,Interface0501D2 {


}
