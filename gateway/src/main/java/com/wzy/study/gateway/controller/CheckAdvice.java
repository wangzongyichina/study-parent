package com.wzy.study.gateway.controller;

import com.wzy.study.gateway.exception.CheckException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.support.WebExchangeBindException;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/5 11:55
 * @Desc:
 */

@ControllerAdvice
public class CheckAdvice {

    @ExceptionHandler(WebExchangeBindException.class)
    public ResponseEntity<String> handleBindException(WebExchangeBindException e) {
        return new ResponseEntity<>(toStr(e), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CheckException.class)
    public ResponseEntity<String> handleCheckException(CheckException e) {
        return new ResponseEntity<>(toStr(e), HttpStatus.BAD_REQUEST);
    }

    private String toStr(WebExchangeBindException ex) {
        return ex.getFieldErrors().stream().map(e -> e.getField() + ":" + e.getDefaultMessage()).reduce("",
            (x1, x2) -> x1 + "\n" + x2);
    }

    private String toStr(CheckException ex) {
        return ex.getFileName() + "的值错误，不能是" + ex.getFileValue();

    }

}
