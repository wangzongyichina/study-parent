package com.wzy.study.other.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/13 18:23
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int id;
    private Integer age;
}
