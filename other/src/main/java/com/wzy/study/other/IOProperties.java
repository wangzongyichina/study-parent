package com.wzy.study.other;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 21:59
 * @Desc:
 */

public class IOProperties {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("other/src/main/resources/properties");
        Properties properties = new Properties();
        properties.load(fileReader);
        System.out.println(properties.get("sex"));
        System.out.println(properties.getProperty("sex2"));
        Object age = properties.get("age");
        System.out.println(age);
    }
}
