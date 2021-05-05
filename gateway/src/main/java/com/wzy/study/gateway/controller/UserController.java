package com.wzy.study.gateway.controller;

import com.wzy.study.gateway.domain.User;
import com.wzy.study.gateway.repository.UserRepository;
import com.wzy.study.gateway.util.CheckUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/4 18:30
 * @Desc:
 */

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/")
    public Mono<User> createUser(@Valid @RequestBody User user) {
        // 新增和修改都是 save ，id 存在是修改，
        CheckUtil.checkName(user.getName());
        Mono<User> save = userRepository.save(user);
        return save;
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> deleteUser(@PathVariable("id") String id) {
        // 返回值为空，不能判断是否删除成功
        // Mono<Void> voidMono = userRepository.deleteById(id);
        return this.userRepository.findById(id)
            // 当需要操作数据，并返回一个 Mono 这时使用flatMap
            // 如果不操作数据，只是装换数据，使用map
            .flatMap(
                user -> this.userRepository.deleteById(id).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK))))
            .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @PutMapping("/{id}")
    public Mono<ResponseEntity<User>> updateUser(@PathVariable("id") String id, @Validated @RequestBody User user) {
        CheckUtil.checkName(user.getName());
        user.setId(id);
        // return userRepository.findById(id)
        // .flatMap(oldUser -> userRepository.save(user).then(Mono.just(new ResponseEntity<>(user, HttpStatus.OK))))
        // .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));

        // 上面的写法或者下面的写法
        return userRepository.findById(id)
            // 操作数据
            .flatMap(u -> {
                u.setId(id);
                u.setAge(user.getAge());
                u.setName(user.getName());
                return userRepository.save(u);
            })
            // 转换数据
            .map(u -> new ResponseEntity<>(u, HttpStatus.OK))
            .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    /**
     * 以数组形式返回
     *
     * @return
     */
    @GetMapping("/all")
    public Flux<User> getUser() {
        return userRepository.findAll();
    }

    /**
     * 以SSE形式多次返回
     *
     * @return
     */
    @GetMapping(value = "/stream/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> getUserStream() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<User>> getUserById(@PathVariable("id") String id) {
        return userRepository.findById(id).map(u -> new ResponseEntity<>(u, HttpStatus.OK))
            .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @GetMapping("/age/{start}/{end}")
    public Flux<User> getUserByAgeBetween(@PathVariable("start") Integer start, @PathVariable("end") int end) {

        return userRepository.getUserByAgeBetween(start, end);
    }

    @GetMapping(value = "/stream/age/{start}/{end}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> getUserByAgeBetweenStream(@PathVariable("start") Integer start, @PathVariable("end") int end) {

        return userRepository.getUserByAge(start, end);
    }

}
