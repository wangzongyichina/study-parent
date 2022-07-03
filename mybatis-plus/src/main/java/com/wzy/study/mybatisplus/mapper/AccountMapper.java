package com.wzy.study.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzy.study.common.bean.Account;
import org.springframework.stereotype.Repository;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/12 19:45
 * @Desc:
 */

/**
 * 只需要继承基础类 BaseMapper
 */

@Repository
public interface AccountMapper extends BaseMapper<Account> {



}
