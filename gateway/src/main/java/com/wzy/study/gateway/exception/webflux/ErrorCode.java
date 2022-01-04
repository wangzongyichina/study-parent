package com.wzy.study.gateway.exception.webflux;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangzongyi
 * @Date: 2021/12/15 0:30
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorCode {
    private String code;
    private String msg;
}
