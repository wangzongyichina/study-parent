package com.wzy.study.system.log.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * @Author: wangzongyi
 * @Data: 2021/11/6 21:40
 * @Desc:
 */

public class JCLTest {

    @Test
    public void test1(){
        /**
         * JCL 使用原则
         *     如果有 Log4j ,有限使用 log4j
         *     如果没有任何第三方日志框架，使用JUL
         */
        Log log = LogFactory.getLog(JCLTest.class);
        log.info("info 信息");
    }



}
