package com.wzy.study.gateway.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/4 18:25
 * @Desc:
 */

@Data
@Document(collection = "user")
public class User {

    @Id
    private String id;

    @NotBlank(message = "name不能为空")
    private String name;

    @Range(min = 0, max = 150, message = "年龄必须在1-150之间")
    private int age;

}
