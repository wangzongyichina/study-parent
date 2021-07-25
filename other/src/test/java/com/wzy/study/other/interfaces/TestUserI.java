package com.wzy.study.other.interfaces;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserI {

    @Autowired
    private UserI userI;

    @Test
    public void test1(){
        userI.methodString();
    }

}
