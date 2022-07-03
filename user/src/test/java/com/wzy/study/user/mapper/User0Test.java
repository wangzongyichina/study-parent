package com.wzy.study.user.mapper;

import java.util.Date;
import java.util.List;

import cn.hutool.json.JSONObject;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzy.study.user.bean.User0;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


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
        for (int i = 0; i < 25; i++) {

            int id = i;
            user0.setId(id);
            user0.setName("小明-"+id);
            user0.setEmail("12345@qq.com");
            user0.setCreateTime(new Date());
            user0Mapper.insertUser0(user0);
        }
    }


    @Test
    public void selectUser0(){
        User0 user0 = user0Mapper.getUser0(1);
        System.out.println(user0);
    }


    @Test
    public void selectUser0List() {

        Page<Object> page = PageHelper.startPage(0, 4, false);
        page.setTotal(10);
        List<User0> user0List = user0Mapper.getUser0List();
        System.out.println("user0List = " + user0List);
        PageInfo<User0> pageInfo = new PageInfo<>(user0List);
        System.out.println("-------------");
        System.out.println(JSON.toJSONString(pageInfo));
        System.out.println("-------------");

        System.out.println("user0List.size() = " + user0List.size());
        user0List.forEach(System.out::println);
    }


}
