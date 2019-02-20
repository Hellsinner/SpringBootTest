package com.hellsinner.demo.controller;

import com.hellsinner.demo.model.dto.ResponseDto;
import com.hellsinner.demo.model.pojo.Play;
import com.hellsinner.demo.service.PlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/springBootTest")
public class PlayController {
    @Autowired
    private PlayService playService;

    @GetMapping("/play/list")
    public List<Play> findAll(){
        return playService.findAll();
    }

    @PostMapping("/play/add")
    public Play add(Play play){
        return playService.add(play);
    }

    @GetMapping("/play/find/{id}")
    public Play get(@PathVariable int id){
        return playService.find(id);
    }

    @GetMapping("/play/evict/{id}")
    public ResponseDto evict(@PathVariable int id){
        playService.delete(id);
        return ResponseDto.ok();
    }

    @GetMapping("/redis/test")
    public ResponseDto redis(){
        playService.redis();
        return ResponseDto.ok();
    }

    @GetMapping("/jedis/test")
    public ResponseDto jedis(){
        playService.jedis();
        return ResponseDto.ok();
    }
}
