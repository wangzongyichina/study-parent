package com.wzy.study.other.interfaces.impl;

import com.wzy.study.other.interfaces.AuditUser;
import org.springframework.stereotype.Component;

@Component("UserAuditUserImpl")
public class UserAuditUserImpl implements AuditUser {

    @Override
    public String notStaic() {
        System.out.println("notStaic");
        return null;
    }

    public static void Static(){
        System.out.println("static");
    }

}
