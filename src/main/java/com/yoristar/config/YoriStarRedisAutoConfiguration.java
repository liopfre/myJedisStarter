package com.yoristar.config;

import com.yoristar.properties.MyRedisStarterProperties;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * 作者：YoriStar
 * 时间：2023/7/15 14:45
 * 描述：TODO
 */
@EnableConfigurationProperties(MyRedisStarterProperties.class)
@Configuration
public class YoriStarRedisAutoConfiguration {

    @Bean(name = "createJedis")
    @ConditionalOnMissingBean(name = "createJedis")
    public Jedis createJedis(MyRedisStarterProperties myRedisStarterProperties){
        int port=myRedisStarterProperties.getPort();
        String host=myRedisStarterProperties.getHost();

        return new Jedis(host,port);//创建jedis对象
    }

}
