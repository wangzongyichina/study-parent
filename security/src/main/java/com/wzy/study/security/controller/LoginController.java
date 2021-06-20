package com.wzy.study.security.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Objects;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/19 18:05
 * @Desc:
 */

@RestController
@Log4j2
public class LoginController {

    @GetMapping(value = "/login/success")
    private String loginSuccessGet() {
        log.error("**********************");
        log.info("logInfo-get-登陆成功");
        return "登陆成功";
    }

    @PostMapping(value = "/login/success")
    private String loginSuccessPost() {
        log.error("**********************");
        log.info("logInfo-post-登陆成功");
        return getUser()+"登陆成功";
    }

//    @GetMapping(value = "/login")
//    private String loginGet() {
//        log.error("**********************");
//        log.info("log-get-登陆成功");
//        return "login";
//    }

    @PostMapping(value = "/login")
    private String login() {
        log.error("**********************");
        log.info("log-post-登陆成功");
        return "login";
    }


    @RequestMapping( value = "/rest")
    public void request(){
        log.info("RequestMapping");
    }

    @RequestMapping( value = "/rest",method = RequestMethod.POST)
    public void request1(){
        log.info("RequestMapping-1");
    }


    private String getUser(){
//        log.info(securityContextHolder.);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        log.info(authentication);
        Object principal = authentication.getPrincipal();
        if (Objects.isNull(principal)){
            return "匿名";
        }
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        log.info("authorities:{}",authorities);
        log.info("getDetails:{}",authentication.getDetails());
        log.info("getCredentials:{}",authentication.getCredentials());
        if (principal instanceof org.springframework.security.core.userdetails.UserDetails){
            UserDetails userDetails = (UserDetails) principal;
            return userDetails.getUsername();
        }
        throw new RuntimeException("获取用户异常");
    }

}
