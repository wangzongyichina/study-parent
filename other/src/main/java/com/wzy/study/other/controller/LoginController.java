package com.wzy.study.other.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/19 18:05
 * @Desc:
 */

@RestController
@Log4j2
public class LoginController {

    @GetMapping(value = "/login/successss")
    private String loginSuccess() {
        log.error("**********************");
        log.info("logInfo-get-登陆成功");
        return "登陆成功";
    }
//    @PostMapping(value = "/login/success")
//    private String loginSuccessP() {
//        log.error("**********************");
//        log.info("logInfo-post-登陆成功");
//        return "登陆成功";
//    }

    @RequestMapping( value = "rest")
    public void request(){
        log.info("RequestMapping");
    }
}
