package com.wzy.study.system.log.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: wangzongyi
 * @Data: 2021/11/15 23:59
 * @Desc:
 */

public class LogBackTest {


    @Test
    public void test1(){
        Logger logger = LoggerFactory.getLogger(LogBackTest.class);
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
    }


}
