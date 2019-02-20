package com.hellsinner.demo.service;

import com.hellsinner.demo.model.pojo.Play;

import java.util.List;

public interface PlayService {
    public List<Play> findAll();

    Play add(Play play);

    Play find(int id);

    void delete(int id);

    void redis();

    void jedis();
}
