package com.wzy.study.security.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/19 18:05
 * @Desc:
 */

@RestController
@Log4j2
public class LoginController {

    @GetMapping(value = "/login/success")
    private String loginSuccess() {
        log.error("**********************");
        log.info("logInfo-登陆成功");
        return "登陆成功";
    }
}
