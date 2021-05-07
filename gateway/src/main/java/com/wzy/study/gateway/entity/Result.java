package com.wzy.study.gateway.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/8 0:43
 * @Desc:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private final static Integer successCode = 0;

    /**
     * 0 成功
     */
    private Integer code;

    private String message;

    private T data;


    public static <F> Result<F> SuccessResult(String message, F data) {
        return new Result(successCode, message, data);
    }



    public void successResult(String message, T data) {
        this.code = successCode;
        this.message = message;
        this.data = data;
    }

    public <K> K getDataK(K dataK) {
        return dataK;
    }

}
