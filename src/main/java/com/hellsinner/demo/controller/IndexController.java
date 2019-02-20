package com.hellsinner.demo.controller;

import com.hellsinner.demo.model.dto.ResponseDto;
import com.hellsinner.demo.model.pojo.User;
import com.hellsinner.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseDto login(User user){
        return userService.login(user);
    }

    @PostMapping("/register")
    public ResponseDto register(User user){
        System.out.println(user);
        return ResponseDto.ok();
    }
}
