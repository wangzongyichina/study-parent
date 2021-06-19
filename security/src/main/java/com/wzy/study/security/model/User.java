package com.wzy.study.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/19 20:16
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    String password;

    String username;

    Integer age;

}
