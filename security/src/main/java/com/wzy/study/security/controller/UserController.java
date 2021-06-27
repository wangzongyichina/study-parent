package com.wzy.study.security.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

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
    private String user1() {
        log.error("**********************");
        log.info("logInfo-访问user1");
        return "访问user1";
    }

    @GetMapping("/user2")
    private String user2_1() {
        log.error("**********************");
        log.info("logInfo-访问user2_1");
        return "访问user2_1";
    }

    @GetMapping("/user2/{id}")
    private String user2_get(@PathVariable("id") Integer id) {
        log.error("**********************");
        log.info("logInfo-访问user2_1_get");
        return "访问user2_1_get";
    }

    @PostMapping("/user2/{id}")
    private String user2(@PathVariable("id") Integer id) {
        log.error("**********************");
        log.info("logInfo-访问user2+id:{}", id);
        return "访问user2";
    }

    @PostMapping("/user3")
    private String user3_post() {
        log.error("**********************");
        log.info("logInfo-post访问user3");
        return "访问user3";
    }

    @GetMapping("/user3")
    private String user3_get() {
        log.error("**********************");
        log.info("logInfo-get-访问user3");
        return "访问user3";
    }

    @GetMapping("/user3/{id}")
    private String user3_get(@PathVariable int id) {
        log.error("**********************");
        log.info("logInfo-get-访问user3_id:{}", id);
        return "访问user3";
    }

    @PostMapping("/user3/{id}")
    private String user3_post(@PathVariable int id) {
        log.error("**********************");
        log.info("logInfo-post访问user3_id:{}", id);
        return "访问user3";
    }

    @GetMapping("/detail")
    private String userDetail() {
        log.error("**********************");
        log.info("logInfo-访问detail");
        return "访问user-detail";
    }

}
