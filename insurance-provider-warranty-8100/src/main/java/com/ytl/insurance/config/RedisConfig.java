package com.ytl.insurance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Bean
    public RedisTemplate<String,Object> getRedisTemplate(RedisConnectionFactory factory){
        RedisTemplate<String,Object> redisTemplate=new RedisTemplate<String,Object>();
        //设置连接的工厂对象
        redisTemplate.setConnectionFactory(factory);
        //设置序列化器 ：实现序列化和反序列化
        //设置key的序列化器
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置value的序列化器
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new StringRedisSerializer());
        return redisTemplate;
    }


}
