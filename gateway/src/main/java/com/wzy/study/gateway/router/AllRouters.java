package com.wzy.study.gateway.router;

import com.wzy.study.gateway.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/5 16:20
 * @Desc:
 */

@Configuration
public class AllRouters {

    @Bean
    RouterFunction<ServerResponse> userRouter(UserHandler userHandler) {
        return RouterFunctions.nest(
            //
            RequestPredicates.path("/user"),
            RouterFunctions.route(RequestPredicates.GET("/"), userHandler::getAllUser)
                .andRoute(RequestPredicates.GET("/s"), userHandler::getAllUser2)
                .andRoute(RequestPredicates.POST("/").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                    userHandler::createrUser)
                .andRoute(RequestPredicates.POST("/s").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                    userHandler::createrUser2)
                .andRoute(RequestPredicates.DELETE("/{id}"), userHandler::deleteUser)
                .andRoute(RequestPredicates.DELETE("/s/{id}"), userHandler::deleteUser2));

    }
}
