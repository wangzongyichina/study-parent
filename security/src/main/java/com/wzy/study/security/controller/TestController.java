package com.wzy.study.security.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/19 16:49
 * @Desc:
 */

@RestController
@RequestMapping("test")
@Log4j2
public class TestController {

    @GetMapping("a1")
    private String test1() {
        log.error("**********************");
        log.info("logInfo-test-a1");
        return "test-a1";
    }

}
