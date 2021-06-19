package com.wzy.study.security.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/19 20:08
 * @Desc:
 */

@Service
@Log4j2
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.error("**********************");

        UserDetails userDetails = User.withUsername("王综艺").password("123").authorities("test","user").build();
        return userDetails;
    }

}
