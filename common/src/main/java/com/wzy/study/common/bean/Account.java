package com.wzy.study.common.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: wangzongyi
 * @Data: 2021/11/4 20:59
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long id;

    private String name;

    private String displayName;

    private String phone;

    private String idNo;

    private Integer age;

    private char sex;

    private String address;

    private Date createTime;

    private Date modifyTime;

    private int deleted;

}
