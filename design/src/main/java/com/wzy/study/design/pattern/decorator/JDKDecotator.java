package com.wzy.study.design.pattern.decorator;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author: wangzongyi
 * @Data: 2021/11/18 21:02
 * @Desc:
 */

public class JDKDecotator {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * IO流就是用到的装饰器模式
         */
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(""));
    }
}
