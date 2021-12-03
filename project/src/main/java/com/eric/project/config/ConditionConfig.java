package com.eric.project.config;


import com.eric.project.pojo.Apple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 *
 * @author ericzhang 2021/11/13 4:27 下午
 */
@Configuration
public class ConditionConfig {

//按顺序排列

    @Bean("appleTest")
//    @ConditionOnJedis(values = {"redis.clients.jedis.Jedis"})  //当引入jedis才进行配置得到bean
//    @ConditionalOnMissingBean(value = TestConOnMissBean.class)
    public Apple getApple(){
        return new Apple();
    }

//    @Bean
//    public TestConOnMissBean TestConOnMissBean(){
//        return new TestConOnMissBean();
//    }




}
