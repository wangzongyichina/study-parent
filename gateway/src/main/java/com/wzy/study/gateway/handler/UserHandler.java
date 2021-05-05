package com.wzy.study.gateway.handler;

import com.wzy.study.gateway.domain.User;
import com.wzy.study.gateway.repository.UserRepository;
import com.wzy.study.gateway.util.CheckUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/5 15:34
 * @Desc:
 */

@Component
public class UserHandler {

    private final UserRepository userRepository;

    public UserHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<ServerResponse> getAllUser(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(userRepository.findAll(), User.class);
    }

    public Mono<ServerResponse> getAllUser2(ServerRequest request) {
        return userRepository.findAll().then(ServerResponse.ok().body(userRepository.findAll(), User.class))
            .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> createrUser(ServerRequest request) {
        Mono<User> userMono = request.bodyToMono(User.class);
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
            .body(userRepository.saveAll(userMono), User.class).switchIfEmpty(ServerResponse.badRequest().build());
    }

    public Mono<ServerResponse> createrUser2(ServerRequest request) {
        Mono<User> userMono = request.bodyToMono(User.class);
        return userMono.flatMap(user -> {
            CheckUtil.checkName(user.getName());
            return userRepository.save(user).then(ServerResponse.ok().build())
                .switchIfEmpty(ServerResponse.badRequest().build());
        });

        // return userRepository.saveAll(userMono).then(ServerResponse.ok().build())
        // .switchIfEmpty(ServerResponse.badRequest().build());

    }

    public Mono<ServerResponse> deleteUser(ServerRequest request) {
        String id = request.pathVariable("id");
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
            .body(userRepository.findById(id).flatMap(user -> userRepository.delete(user)).then(), User.class)
            .switchIfEmpty(ServerResponse.noContent().build());
    }

    public Mono<ServerResponse> deleteUser2(ServerRequest request) {
        String id = request.pathVariable("id");
        return userRepository.findById(id).flatMap(us -> userRepository.delete(us)).then(ServerResponse.ok().build())
            .switchIfEmpty(ServerResponse.noContent().build());
    }

}
