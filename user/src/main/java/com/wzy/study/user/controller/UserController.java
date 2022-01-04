package com.wzy.study.user.controller;

import com.wzy.study.user.bean.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangzongyi
 * @Data: 2021/11/4 20:58
 * @Desc:
 */

@RestController("/user")
public class UserController {

    @GetMapping("/list")
    public Account getAccount() {
        return new Account("小明", 18, 'm', "湖南长沙市");
    }

}
