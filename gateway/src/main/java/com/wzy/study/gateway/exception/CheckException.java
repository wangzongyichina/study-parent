package com.wzy.study.gateway.exception;

import lombok.Data;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/5 12:49
 * @Desc:
 */

@Data
public class CheckException extends RuntimeException{

    private String fileName;
    private String fileValue;

    public CheckException(String fileName, String fileValue) {
        this.fileName = fileName;
        this.fileValue = fileValue;
    }

    public CheckException() {
        super();
    }

    public CheckException(String message) {
        super(message);
    }

    public CheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckException(Throwable cause) {
        super(cause);
    }

    protected CheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
