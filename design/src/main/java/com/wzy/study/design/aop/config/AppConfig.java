package com.wzy.study.design.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangzongyi
 * @Data: 2021/2/28 14:49
 * @Desc:
 */

@Configuration
@ComponentScan(basePackageClasses = {com.wzy.study.design.aop.impl.BuyImpl.class})
public class AppConfig {
}
