package com.wzy.study.system.log.jul;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/31 17:08
 * @Desc:
 */

public class JULTest {

    @Test
    public void testQuickJUL() throws Exception {
        Logger log = Logger.getLogger("com.wzy.study.system.log.jul.JULTest");
        log.info("Hello JUL");

    }

    public static void main(String[] args) {
        Logger log = Logger.getLogger("com.wzy.study.system.log.jul.JULTest");
        log.info("Hello JUL");

        String name = "小红";
        Integer age = 20;
        log.log(Level.INFO, "name={0}, age={1}", new Object[] {
                name, age
        });
    }
}
