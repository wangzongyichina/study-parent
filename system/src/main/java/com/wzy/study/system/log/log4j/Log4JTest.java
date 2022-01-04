package com.wzy.study.system.log.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

/**
 * @Author: wangzongyi
 * @Data: 2021/11/2 21:17
 * @Desc:
 */

public class Log4JTest {

    @Test
    public void test() {
        // 注意一定要先加载初始化配置，不然报警告，无法输出日志。必须放在 log输出语句前
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(Log4JTest.class);
        logger.info("test");
    }

    @Test
    public void test1() {
        // 使用自己的配置文件 不用默认的 BasicConfigurator.configure();
        Logger logger = Logger.getLogger(Log4JTest.class);
        Logger root = Logger.getRootLogger();
        root.addAppender(new ConsoleAppender(new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN)));
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
        logger.fatal("fatal 信息");
    }

    @Test
    public void test2() {
        // 设置打印日志的详细信息;
        LogLog.setInternalDebugging(true);
        Logger logger = Logger.getLogger(Log4JTest.class);
        Logger root = Logger.getRootLogger();
        root.addAppender(new ConsoleAppender(new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN)));
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
        logger.fatal("fatal 信息");
    }

    @Test
    public void test3() {
        // 自定义 输出模式 ;
        Logger logger = Logger.getLogger(Log4JTest.class);
        Logger root = Logger.getRootLogger();
        root.addAppender(new ConsoleAppender(new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN)));
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
        logger.fatal("fatal 信息");
    }
    @Test
    public void test4() {
        // 讲日志输出到文件
        Logger logger = Logger.getLogger(Log4JTest.class);
        Logger root = Logger.getRootLogger();
        root.addAppender(new ConsoleAppender(new PatternLayout(PatternLayout.TTCC_CONVERSION_PATTERN)));
        logger.trace("trace 信息");
        logger.debug("debug 信息");
        logger.info("info 信息");
        logger.warn("warn 信息");
        logger.error("error 信息");
        logger.fatal("fatal 信息");
    }

}
