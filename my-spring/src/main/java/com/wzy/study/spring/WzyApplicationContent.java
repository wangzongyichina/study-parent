package com.wzy.study.spring;

import com.wzy.study.annotation.ComponentScan;

import java.io.File;
import java.net.URL;

/**
 * @Author: wangzongyi
 * @Date: 2023/7/2 16:05
 * @Desc:
 */

public class WzyApplicationContent {
    private Class configClass;

    public WzyApplicationContent(Class configClass) {
        this.configClass = configClass;

        // 扫描
        if (configClass.isAnnotationPresent(ComponentScan.class)) {
            //configClass.isAssignableFrom()
            ComponentScan componentScan = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
            // com.wzy.study
            String value = componentScan.value();
            System.out.println(value);
            String path = value.replace(".", "/");
            ClassLoader classLoader = WzyApplicationContent.class.getClassLoader();
            URL resource = classLoader.getResource(path);
            System.out.println("resource = " + resource);
            File file = new File(resource.getFile());
            System.out.println("file = " + file);
            if (file.isDirectory()){
                File[] files = file.listFiles();
                for (File fi : files) {
                    String fileName = fi.getAbsolutePath();
                    System.out.println("fileName = " + fileName);
                }
            }
        }

    }

    public Object getBean(String name) {

        return null;
    }

}
