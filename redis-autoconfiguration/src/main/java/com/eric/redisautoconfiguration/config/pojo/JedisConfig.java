package com.eric.redisautoconfiguration.config.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * description
 *
 * @author ericzhang 2021/11/15 11:30 上午
 */
@ConfigurationProperties(prefix = "jedis")
public class JedisConfig {
    private String host;
    private Integer port;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
