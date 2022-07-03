package com.wzy.study.mybatisplus.mapper;

import com.wzy.study.mybatisplus.pojo.User0;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @Author: wangzongyi
 * @Date: 2022/7/2 14:16
 * @Desc:
 */

@SpringBootTest
public class User0Test {

    @Autowired
    private User0Mapper user0Mapper;


    @Test
    public void addUser0(){
        User0 user0 = new User0();
        int id = 2;
        user0.setId(id);
        user0.setName("小米-"+id);
        user0.setEmail("12345@qq.com");
        user0.setCreateTime(new Date());
        user0Mapper.insertUser0(user0);
    }

}
