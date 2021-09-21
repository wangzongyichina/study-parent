package com.wzy.study.design.redis.jedis;

import redis.clients.jedis.Jedis;

/**
 * @Author: wangzongyi
 * @Data: 2021/9/21 22:39
 * @Desc:
 */

public class JedisTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.1.102",6379);
        String auth = jedis.auth("123456@");
        System.out.println("auth = " + auth);
        String ping = jedis.ping();
        System.out.println(ping);
        String set = jedis.set("jedis", "java");

    }
}
