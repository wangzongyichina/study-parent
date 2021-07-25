package com.wzy.study.other.interfaces.impl;

import com.wzy.study.other.interfaces.UserI;
import org.springframework.stereotype.Component;

@Component
public class UserImpl implements UserI {
    @Override
    public String methodString() {
        System.out.println("UserImpl-1");
        return "UserImpl-1";
    }
}
