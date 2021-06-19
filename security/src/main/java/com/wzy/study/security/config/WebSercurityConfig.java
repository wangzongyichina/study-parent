package com.wzy.study.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import sun.security.util.Password;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/19 16:48
 * @Desc:
 */

@Configuration
public class WebSercurityConfig extends WebSecurityConfigurerAdapter {

    // 定义用户信息服务
//    @Bean
//    public UserDetailsService userDetailsService(){
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("王综艺").password("123").authorities("test","user").build());
//        return manager;
//    }

    // 密码编码器
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    // 安全拦截机制
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http);
        http.authorizeRequests()
                .antMatchers("/test**").hasAnyAuthority("test")
                .antMatchers("/user**").hasAnyAuthority("user")
                .antMatchers("/login**").permitAll().and().formLogin()
                .loginProcessingUrl("/login/success");

    }
}
