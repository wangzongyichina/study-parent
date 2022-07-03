package com.wzy.study.user.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User0 {

    private Integer id;

    private String name;

    private Integer age;

    private String email;

    private Date createTime;

    private Date modifyTime;

}