package com.wzy.study.system.log.log4j2;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @Author: wangzongyi
 * @Data: 2021/11/16 21:42
 * @Desc:
 */

public class Log4J2Test {

    @Test
    public void test() {
        /**
         *
         */
        Logger logger = LogManager.getLogger(Log4J2Test.class);
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
        logger.fatal("fatal 信息");
    }

}
