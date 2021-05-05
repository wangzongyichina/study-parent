package com.wzy.study.gateway.exception;

import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;
import reactor.core.publisher.Mono;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/5 17:54
 * @Desc:
 */

@Component
@Order(-2) // 数字越小优先级越高，默认时可能不会走进这个异常
public class ExceptionHandler implements WebExceptionHandler {
    @Override
    public Mono<Void> handle(ServerWebExchange serverWebExchange, Throwable throwable) {
        ServerHttpResponse response = serverWebExchange.getResponse();
        response.setStatusCode(HttpStatus.BAD_REQUEST);
        response.getHeaders().setContentType(MediaType.APPLICATION_JSON);

        String errorMsg = toStr(throwable);
        DataBuffer db = response.bufferFactory().wrap(errorMsg.getBytes());
        return response.writeWith(Mono.just(db));
    }

    private String toStr(Throwable throwable) {
        // 已知异常
        if (throwable instanceof CheckException) {
            CheckException chex = (CheckException) throwable;
            return chex.getFileName() + ": inviald value " + chex.getFileValue();
        }
        // 未知异常，需要打印堆栈，方便定位问题
        else {
            throwable.getStackTrace();
            return throwable.toString();
        }
    }
}
