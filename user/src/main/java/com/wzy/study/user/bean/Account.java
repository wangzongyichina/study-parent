package com.wzy.study.user.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangzongyi
 * @Data: 2021/11/4 20:59
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String name;

    private Integer age;

    private char sex;

    private String address;

}
