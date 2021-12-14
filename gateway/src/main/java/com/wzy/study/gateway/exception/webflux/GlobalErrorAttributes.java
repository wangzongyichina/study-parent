package com.wzy.study.gateway.exception.webflux;

import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;

import java.rmi.ServerException;
import java.util.LinkedHashMap;
import java.util.Map;

//全局异常处理
@Component
public class GlobalErrorAttributes extends DefaultErrorAttributes {
    public GlobalErrorAttributes() {
        super(false);
    }

    @Override
    public Map<String, Object> getErrorAttributes(ServerRequest request, boolean includeStackTrace) {
        return assembleError(request);
    }

    private Map<String, Object> assembleError(ServerRequest request) {
        Map<String, Object> errorAttributes = new LinkedHashMap<>();
        Throwable error = getError(request);
        if (error instanceof ServerException) {
            //errorAttributes.put("code", ((ServerException) error).getCode().getCode());
            errorAttributes.put("data", error.getMessage());
        }
        else {
            errorAttributes.put("code", HttpStatus.INTERNAL_SERVER_ERROR);
            errorAttributes.put("data", "INTERNAL SERVER ERROR");
        }
        return errorAttributes;
    }
}
