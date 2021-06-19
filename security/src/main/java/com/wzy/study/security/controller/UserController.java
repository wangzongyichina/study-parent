package com.wzy.study.security.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/19 20:14
 * @Desc:
 */

@RestController
@RequestMapping("/user")
@Log4j2
public class UserController {

    @GetMapping("/user1")
    private String user1(){
        log.error("**********************");
        log.info("logInfo-访问user1");
        return "访问user1";
    }
}
