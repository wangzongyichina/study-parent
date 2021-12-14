package com.wzy.study.gateway.exception.webflux;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    private final Log logger = LogFactory.getLog(getClass());

    @ExceptionHandler(Exception.class)
    @ResponseStatus(code = HttpStatus.OK)
    public ErrorCode handleCustomException(Exception e) {
        logger.error(e.getMessage());
        return new ErrorCode("e", "error");
    }
}