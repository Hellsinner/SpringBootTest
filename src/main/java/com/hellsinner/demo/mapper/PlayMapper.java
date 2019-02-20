package com.hellsinner.demo.mapper;

import com.hellsinner.demo.model.pojo.Play;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayMapper {
    public List<Play> findAll();

    public void insert(Play play);

    Play find(@Param("id") int id);

    void delete(@Param("id") int id);
}
