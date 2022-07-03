package com.wzy.study.user.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/12 15:52
 * @Desc:
 */

@Configuration
public class druidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    // 后台监控
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        // 配置后台登陆密码

        HashMap<String, String> initParametes = new HashMap<>();

        // 设置登陆账号密码，key (loginUsername, loginPassword) 是固定的
        initParametes.put("loginUsername","admin");
        initParametes.put("loginPassword","123456");

        // 允许谁可以访问
        // initParametes.put("allow","123456");

        // 禁止谁可以访问
        // initParametes.put("allow","192.168.0.101");

        bean.setInitParameters(initParametes);  //设置初始化参数

        return bean;
    }

}
