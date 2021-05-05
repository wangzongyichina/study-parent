package com.wzy.study.gateway.lambda;

import java.text.DecimalFormat;
import java.util.function.Function;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/1 17:06
 * @Desc:
 */

//public interface IMoneyFormat {
//    String format(int i);
//}

class MyMoney {
    private final int money;

    MyMoney(int money) {
        this.money = money;
    }

    public void printMoney(Function<Integer,String> format) {
        System.out.println("我的存款:" + format.apply(money));
    }
}

class MOneyDemo{
    public static void main(String[] args) {
        MyMoney myMoney = new MyMoney(99999999);
        Function<Integer, String> function = i -> new DecimalFormat("#,###").format(i);
        myMoney.printMoney(function.andThen(s->"人民币"+s));
        myMoney.printMoney(function.compose(s->s));

        Function<Integer, Integer> practice = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*3;
            }
        };
        System.out.println(practice.apply(3));

        int num =4;
        Function<Integer,Integer> doubleNum = i -> 2 * i;
        Function<Integer,Integer> squard = i -> i * i;
//        System.out.println(doubleNum.apply(3));
        System.out.println(doubleNum.compose(squard).apply(num));
        System.out.println(doubleNum.andThen(squard).apply(num));
        System.out.println(squard.apply(num));
        System.out.println(doubleNum.apply(num));
        System.out.println(Function.identity().apply(num));
    }
}
