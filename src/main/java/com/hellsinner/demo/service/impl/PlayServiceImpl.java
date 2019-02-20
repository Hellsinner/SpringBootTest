package com.hellsinner.demo.service.impl;

import com.hellsinner.demo.mapper.PlayMapper;
import com.hellsinner.demo.model.pojo.Play;
import com.hellsinner.demo.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PlayServiceImpl implements PlayService {

    @Autowired
    private PlayMapper playMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    @Cacheable(value = "playList")
    public List<Play> findAll() {
        System.out.println("查询数据库");
        return playMapper.findAll();
    }

    @Override
    @Transactional
    @CachePut(value = "plays", key = "#play.playId")
    public Play add(Play play) {
        System.out.println("保存");
        playMapper.insert(play);
        return play;
    }

    @Override
    @Cacheable(value = "plays", key = "#id")
    public Play find(int id) {
        System.out.println("查询数据库");
        return playMapper.find(id);
    }

    @Override
    @CacheEvict(value = "plays")
    public void delete(int id) {
        System.out.println("删除id为" +id +"的缓存");
        playMapper.delete(id);
    }

    @Override
    public void redis() {
        redisTemplate.opsForValue().set("redisTest", "test");
        System.out.println(redisTemplate.opsForValue().get("redisTest"));

        stringRedisTemplate.opsForValue().set("redisTest", "test");
        System.out.println(stringRedisTemplate.opsForValue().get("redisTest"));
    }

    @Override
    public void jedis() {
        redisTemplate.delete("redisTest");
    }


    Play buildPlay(){
        Play play = new Play();
        play.setPlayTypeId(50);
        play.setPlayLangId(50);
        play.setPlayName("Play Test");
        play.setPlayIntroduction("test");
        play.setPlayImage("test");
        play.setPlayLength(50);
        play.setPlayTicketPrice(50);
        play.setPlayStatus((short) 1);
        return play;
    }
}
