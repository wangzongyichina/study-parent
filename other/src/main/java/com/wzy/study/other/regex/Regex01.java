package com.wzy.study.other.regex;

import org.junit.Test;

import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/6 21:44
 * @Desc:
 */

public class Regex01 {

    @Test
    public void test01() {
        String str1 = "/v1/biz/234792834";
        boolean matches = Pattern.matches("/v1/biz/[0-9]*", str1);
        System.out.println("matches = " + matches);

    }

    @Test
    public void test02() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("1", "2");
        Object oldValue = hashMap.put("1", "3");
        System.out.println("oldValue = " + oldValue);
    }

}
