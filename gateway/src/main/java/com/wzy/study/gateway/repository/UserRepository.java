package com.wzy.study.gateway.repository;

import com.wzy.study.gateway.domain.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 * @Author: wangzongyi
 * @Data: 2021/5/4 18:28
 * @Desc:
 */

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {

    Flux<User> getUserByAgeBetween(int start, int end);

    @Query("{age:{$gte:20,$lte:41}}")
    Flux<User> getUserByAge(int start, int end);

}
