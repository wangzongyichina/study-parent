package com.wzy.study.other.interfaces;

import com.wzy.study.other.interfaces.impl.UserAuditUserImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestInterfaces {

    @Autowired
    private UserAuditUserImpl userAuditUserImpl;

    @Test
    public void test1(){
        userAuditUserImpl.notStaic();
    }

    @Test
    public void test2(){
        UserAuditUserImpl.Static();
    }
}
