package com.eric.redisautoconfiguration.config;

import com.eric.redisautoconfiguration.config.pojo.JedisConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * description
 *
 * @author ericzhang 2021/11/15 10:54 上午
 */
@Configuration
@EnableConfigurationProperties(JedisConfig.class)
public class JedisAutoConfiguration {

    @Bean(name = "jedisTest")
    public Jedis create(JedisConfig jedisConfig){
        Jedis jedis = new Jedis(jedisConfig.getHost(), jedisConfig.getPort());
        return jedis;
    }

}
