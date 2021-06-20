package com.wzy.study.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
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
        return new BCryptPasswordEncoder();
    }

    // 安全拦截机制
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http);
        http.
                csrf().disable().
                authorizeRequests()
                .antMatchers("/test/**").hasAnyAuthority("test")
                .antMatchers(HttpMethod.GET,"/user/user2/[0-9]*").hasAuthority("detail")
                .antMatchers(HttpMethod.POST,"/user/user2/[0-9]*").hasAuthority("detail")
                .antMatchers(HttpMethod.POST,"/user/user3").hasAuthority("detail")
                .antMatchers("/user/user1").hasAnyAuthority("user")
                .antMatchers("/user/detail").hasAnyAuthority("detail")
                .antMatchers(HttpMethod.GET,"/rest").permitAll()
                .antMatchers(HttpMethod.POST,"/rest").permitAll()
//                .anyRequest().permitAll()
                .and()
                .formLogin() // 允许表单登陆
//                .loginPage("/login-view")
//                .loginProcessingUrl("/login")
                .successForwardUrl("/login/success");

    }
}
