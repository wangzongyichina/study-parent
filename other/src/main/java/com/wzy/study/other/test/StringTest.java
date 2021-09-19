package com.wzy.study.other.test;

import org.apache.logging.log4j.util.Strings;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.Objects;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/23 20:26
 * @Desc:
 */

public class StringTest {

    @Test
    public void test01() {
        String str = "lj.l.jpg";
        System.out.println(str.substring(str.lastIndexOf(".")));
    }

    @Test
    public void test02() {

        System.out.println("---------Buffer---------");
        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            buffer.append(i);
        }
        long endBuffer = System.currentTimeMillis();
        System.out.println((endBuffer - startBuffer));

        System.out.println("---------Builder---------");
        StringBuilder builder = new StringBuilder();
        long startBuilder = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            builder.append(i);
        }
        long endBuilder = System.currentTimeMillis();
        System.out.println((endBuilder - startBuilder));

        System.out.println("---------String.format---------");
        long startFormat = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String.format("%d", i);
        }
        long endFormat = System.currentTimeMillis();
        System.out.println((endFormat - startFormat));

        System.out.println("---------String---------");
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s = s + i;
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));

    }

    @Test
    public void test03() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //boolean sdfs = Strings.isNotEmpty("sdfs");
            //boolean sdfsdf = Strings.isEmpty("sdfsdf");
            //boolean asd = Strings.isBlank("asd");
            //boolean kjl = Strings.isNotBlank("kjl");
            //boolean b = "sdfs".length() != 0;
            //boolean sdfwe = Objects.isNull("sdfwe");
            //boolean llk = Objects.nonNull("llk");
            //boolean sdklfj = StringUtils.isEmpty("sdklfj");

        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }

}
