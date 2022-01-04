package com.wzy.study.system.log.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: wangzongyi
 * @Data: 2021/11/14 17:32
 * @Desc:
 */

public class SLF4JTest {

    @Test
    public void test1() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
    }

    @Test
    public void test2() {
        Logger logger = LoggerFactory.getLogger(SLF4JTest.class);

        try {
            Class.forName("oooo");
        }
        catch (ClassNotFoundException e) {
            logger.info("报错了，具体信息是：", e);
        }

    }

}
