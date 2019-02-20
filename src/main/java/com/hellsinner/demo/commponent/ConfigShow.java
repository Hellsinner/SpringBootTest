package com.hellsinner.demo.commponent;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class ConfigShow implements ApplicationContextAware {
    public ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

        DataSource dataSource = applicationContext.getBean(DataSource.class);

        System.out.println(dataSource.getClass().getName());

        RedisConnectionFactory redisConnectionFactory = applicationContext.getBean(RedisConnectionFactory.class);

        System.out.println(redisConnectionFactory.getClass().getName());

        if (redisConnectionFactory instanceof JedisConnectionFactory){
            JedisConnectionFactory factory = (JedisConnectionFactory) redisConnectionFactory;
            System.out.println(factory.getStandaloneConfiguration().getHostName());
            System.out.println(factory.getPoolConfig().getMaxIdle());
        }
    }
}
