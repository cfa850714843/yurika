package com.phigey.yurika.redis;

import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;

/**
 * @author cfa
 */
public class RedisMain {
    public static void main(String[] args) {

        RedisClient redisClient = RedisClient.create();
        RedisURI redisURI = new RedisURI();

        redisURI.setHost("192.168.7.8");
        redisURI.setPort(50079);
        redisURI.setPassword("redis");
        StatefulRedisConnection<String, String> statefulRedisConnection = redisClient.connect(redisURI);
        System.out.println(" == " + statefulRedisConnection.sync().ping());
        statefulRedisConnection.reactive().set("a", "a1");
        statefulRedisConnection.reactive().set("b", "b1");
        System.out.println("a = " + statefulRedisConnection.reactive().get("a"));
        System.out.println("b = " + statefulRedisConnection.reactive().get("b"));

        statefulRedisConnection.close();
        redisClient.shutdown();

    }
}
