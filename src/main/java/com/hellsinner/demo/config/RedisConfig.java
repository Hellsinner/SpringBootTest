package com.hellsinner.demo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {
//    private RedisConnectionFactory redisConnectionFactory = null;
//
//    @Bean
//    public RedisConnectionFactory redisConnectionFactory(){
//        if (this.redisConnectionFactory != null){
//            return this.redisConnectionFactory;
//        }
//
//        JedisPoolConfig poolConfig = new JedisPoolConfig();
//        poolConfig.setMaxIdle(30);
//        poolConfig.setMaxTotal(50);
//        poolConfig.setMaxWaitMillis(2000);
//
//        JedisConnectionFactory factory = new JedisConnectionFactory(poolConfig);
//        RedisStandaloneConfiguration standaloneConfiguration = factory.getStandaloneConfiguration();
//
//        standaloneConfiguration.setHostName("127.0.0.1");
//        standaloneConfiguration.setPort(6379);
//        standaloneConfiguration.setDatabase(0);
//
//        this.redisConnectionFactory = factory;
//        return factory;
//    }
//
//    @Bean
//    public RedisTemplate redisTemplate(){
//        RedisTemplate<Object, Object> redisTemplate =
//                new RedisTemplate<>();
//
//        RedisSerializer serializer = redisTemplate.getStringSerializer();
//
//        redisTemplate.setKeySerializer(serializer);
//        redisTemplate.setHashKeySerializer(serializer);
//        redisTemplate.setHashValueSerializer(serializer);
//
//        redisTemplate.setConnectionFactory(redisConnectionFactory());
//        return redisTemplate;
//    }
}
