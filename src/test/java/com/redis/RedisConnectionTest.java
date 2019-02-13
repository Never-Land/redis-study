package com.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 连接Redis测试类
 */
public class RedisConnectionTest {
    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool("120.79.164.75", 6379);
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            System.out.println("connection to redis successfully " + jedis.ping());
        }catch(Exception e){
            System.out.println("connection to redis fail!!!" + e);
        }finally{
            if(jedis != null){
                jedis.close();
            }
        }
    }
}