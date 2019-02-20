package com.hellsinner.demo;

import com.hellsinner.demo.service.PlayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests {

    @Autowired
    private PlayService playService;

    @Test
    public void run(){
        System.out.println(playService.findAll());
    }

}

