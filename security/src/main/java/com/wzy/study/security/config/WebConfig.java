package com.wzy.study.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/19 17:45
 * @Desc:
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/login");
//        registry.addViewController("/").setViewName("redirect:/login-view");
//        registry.addViewController("/login-view").setViewName("login");
    }
}
