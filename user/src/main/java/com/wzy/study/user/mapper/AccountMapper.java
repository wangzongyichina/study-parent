package com.wzy.study.user.mapper;

import com.wzy.study.common.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/12 16:41
 * @Desc:
 */

@Repository
@Mapper // 表示这是一个mybatis 的mapper类
public interface AccountMapper {

    int addAccount(Account account);

    List<Account> getAccount();


}
