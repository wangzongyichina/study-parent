package com.wzy.study.gateway.test;

import com.wzy.study.gateway.entity.Person;
import com.wzy.study.gateway.entity.Result;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/8 1:02
 * @Desc:
 */

public class GenetateTest {
    public static void main(String[] args) {
        Result<Person> personResult = new Result<>();
        personResult.successResult("succ", new Person());
        System.out.println("personResult = " + personResult);
        System.out.println(Result.SuccessResult("success", "nihao"));
        System.out.println(Result.SuccessResult("error", new Person("小明")));
    }
}
