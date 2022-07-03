package com.wzy.study.user.mapper;

import com.wzy.study.user.bean.User0;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Author: wangzongyi
 * @Date: 2022/7/2 14:08
 * @Desc:
 */

@Mapper
@Repository
public interface User0Mapper {

    int insertUser0(User0 user0);

    User0 getUser0(int id);

    List<User0> getUser0List();

}
