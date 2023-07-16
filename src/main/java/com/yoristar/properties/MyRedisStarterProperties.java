package com.yoristar.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 作者：YoriStar
 * 时间：2023/7/15 14:36
 * 描述：自定义springBoot starter的配置类
 */

@ConfigurationProperties(prefix = "myredis.properties")//从yml或者properties文件读取配置的前缀信息,不能用驼峰写法不然会报错
public class MyRedisStarterProperties {
    private String host="localhost";
    private int port=6379;

    public MyRedisStarterProperties(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public MyRedisStarterProperties() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
