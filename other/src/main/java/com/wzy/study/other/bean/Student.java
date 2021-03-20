package com.wzy.study.other.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: wangzongyi
 * @Data: 2021/3/20 19:48
 * @Desc:
 */

@Data
@AllArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 336937961453562772L;

    private  int id;
    private  int age;
    private String name;
    private String address;

}
