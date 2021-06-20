package com.wzy.study.security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootTest
class SecurityApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testBCrypt(){
        String hashpw = BCrypt.hashpw("123", BCrypt.gensalt());
        System.out.println("hashpw = " + hashpw);

        //  $2a$10$XEx97x/j3tJ6tTTuiabeaektRexFQvef20hxH8dvwQf3OnQZbV5Ei
        //  $2a$10$3aDa4FC4xgRe/Hd84EdHOO5IZOSynM5I96ZtIbszvakPI4lcrdB6.
    }

    @Test
    void checkBCrypt(){
        boolean checkpw = BCrypt.checkpw("1234", "$2a$10$3aDa4FC4xgRe/Hd84EdHOO5IZOSynM5I96ZtIbszvakPI4lcrdB6.");
        System.out.println("checkpw = " + checkpw);
    }

}
