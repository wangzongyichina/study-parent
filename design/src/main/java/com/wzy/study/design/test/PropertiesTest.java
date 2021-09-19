package com.wzy.study.design.test;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: wangzongyi
 * @Data: 2021/9/12 21:59
 * @Desc:
 */

public class PropertiesTest {

    private static Properties properties ;

    private static ResourceLoader resourceLoader;

    static {
        properties = new Properties();
        try {
            // 文件放在项目中的 resources 下 两种不同方式读
            //properties.load(PropertiesTest.class.getClassLoader().getResourceAsStream("design.properties"));
            properties.load(new FileInputStream("src/main/resources/design.properties"));

            resourceLoader.getResource("design.properties");

            // 文件放在项目外的文件夹下  两种不同方式读
            //properties.load(PropertiesTest.class.getClassLoader().getResourceAsStream("/config/app/local/design.properties"));  // 报错
            //properties.load(new FileInputStream("design.properties"));   //报错
            //properties.load(new FileInputStream("/config/app/local/design.properties"));   //报错


        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        // 测试Properties
        Object value = properties.get("values");
        System.out.println("values = " + value);
    }

    @Test
    public void Test2(){
        Resource values = resourceLoader.getResource("values");
    }
}
