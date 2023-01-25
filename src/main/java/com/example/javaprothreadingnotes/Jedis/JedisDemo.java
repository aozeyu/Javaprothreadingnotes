package com.example.javaprothreadingnotes.Jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisDemo {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool("localhost",6379);
        try (Jedis jedis = pool.getResource()){
            jedis.set("clientName","Jedis");
            jedis.set("name","yaozeyu");
            System.out.println(jedis.get("clientName"));
            System.out.println(jedis.get("name"));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
