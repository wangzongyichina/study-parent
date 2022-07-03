package com.wzy.study.user.controller.springjdbc;

import com.wzy.study.common.constant.IsDelete;
import com.wzy.study.common.bean.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/12 14:01
 * @Desc:
 */

@RestController
@Slf4j
public class SpringJdbcController {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping("/test/user/add/account")
    public void add(){
        Account account1 = new Account(1234L,"小红1","小红","13612349988","4309",19,'M',"湖南",new Date(),null, IsDelete.save);
        Account account2 = new Account(1235L,"小红2","小红","13612349988","4309",19,'M',"湖南",new Date(),null, IsDelete.save);
        //Account account3 = new Account(1236L,"小红3","小红","13612349988","4309",19,'M',"湖南",new Date(),null, IsDelete.save);

        String sql = "insert into account (id, name, display_name) values( ?, ?, ?) ";

        jdbcTemplate.update(sql,new Object[]{1231L, "小红","小红display"});


    }



}
