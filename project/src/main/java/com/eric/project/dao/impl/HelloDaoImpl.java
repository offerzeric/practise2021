package com.eric.project.dao.impl;


import com.eric.project.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;

/**
 * description
 *
 * @author ericzhang 2021/11/12 3:47 下午
 */
@Repository
public class HelloDaoImpl implements HelloDao {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private Jedis jedis;

    public void testRedis(){
        redisTemplate.opsForValue().set("eric","zhangJianhao");
        System.out.println(redisTemplate.opsForValue().get("eric"));
    }



}
