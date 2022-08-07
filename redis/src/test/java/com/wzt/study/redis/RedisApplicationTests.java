package com.wzt.study.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1(){
        redisTemplate.opsForValue().set("redis:user:name", "小米");
        System.out.println("插入数据成功");
        Object o = redisTemplate.opsForValue().get("redis:user:name");
        System.out.println("获取数据成功:"+ o);

    }

}
