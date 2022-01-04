package com.wzy.study.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangzongyi
 * @Data: 2021/10/26 21:15
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    private Integer age;

}
