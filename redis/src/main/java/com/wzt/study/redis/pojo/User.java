package com.wzt.study.redis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangzongyi
 * @Date: 2022/8/9 20:55
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    //private Character sex;
}
