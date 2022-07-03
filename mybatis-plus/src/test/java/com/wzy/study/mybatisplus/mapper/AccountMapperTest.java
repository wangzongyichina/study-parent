package com.wzy.study.mybatisplus.mapper;

import com.wzy.study.common.bean.Account;
import com.wzy.study.common.constant.IsDelete;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/12 19:51
 * @Desc:
 */

@SpringBootTest
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    void addAccount() {
        Account account2 = new Account();
        account2.setName("李明2sdf");
        account2.setAddress("湖南省益阳市");
        account2.setAge(23);
        accountMapper.insert(account2);
    }

    @Test
    void getAccount() {
        List<Account> accounts = accountMapper.selectList(null);
        System.out.println("accounts = " + accounts);
    }

}
