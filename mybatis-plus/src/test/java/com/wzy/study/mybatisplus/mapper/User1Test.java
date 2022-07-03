package com.wzy.study.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.wzy.study.mybatisplus.pojo.User1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/12 20:07
 * @Desc:
 */

@SpringBootTest
public class User1Test {

    @Autowired
    private User1Mapper user1Mapper;

    @Test
    public void addUser1() {

        User1 user1 = new User1();
        user1.setName("小小明3");
        int insert = user1Mapper.insert(user1);
        System.out.println("insert = " + insert);

    }

    @Test
    public void selectUser1() {
        List<User1> user1s = user1Mapper.selectList(null);
        System.out.println("user1s = " + user1s);
    }

    @Test
    void selectUser2(){

        User1 user1 = user1Mapper.selectById(14L);
        System.out.println("user1 = " + user1);
    }

    @Test
    void updateUser1(){
        User1 user1 = new User1();
        user1.setId(1470033861008285697L);
        user1.setName("小军");
        user1.setAge(20);
        int i = user1Mapper.updateById(user1);
        System.out.println("i = " + i);
    }

    @Test
    void updateUser2(){
        User1 user1 = new User1(12L, "ooo", null, "",null,null);
        User1 user2 = new User1(13L, "oobb", 11, "345345",null,null);
        int i = user1Mapper.update(user2,new UpdateWrapper<>(user1));
        System.out.println("i = " + i);
    }

}
