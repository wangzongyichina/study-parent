package com.wzt.study.redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wzt.study.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test1() {


        redisTemplate.opsForValue().set("redis:user:name", "小米");
        System.out.println("插入数据成功");
        Object o = redisTemplate.opsForValue().get("redis:user:name");
        System.out.println("获取数据成功:" + o);

    }

    @Test
    public void test2() {
        User user = new User("小米", 10);
        redisTemplate.opsForValue().set("redis:user:1", user);
        System.out.println("插入数据成功");
        User o = (User) redisTemplate.opsForValue().get("redis:user:1");
        System.out.println("获取数据成功:" + o);

    }

    @Test
    public void test3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("小米", 10);
        String json = mapper.writeValueAsString(user);
        stringRedisTemplate.opsForValue().set("redis:user:2", json);
        System.out.println("插入数据成功");
        String value = stringRedisTemplate.opsForValue().get("redis:user:2");
        User readValue = mapper.readValue(value, User.class);
        System.out.println("获取数据成功:" + readValue);

    }

}
