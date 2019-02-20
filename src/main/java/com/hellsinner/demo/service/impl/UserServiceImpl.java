package com.hellsinner.demo.service.impl;

import com.hellsinner.demo.model.dto.ResponseDto;
import com.hellsinner.demo.model.pojo.User;
import com.hellsinner.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public ResponseDto login(User user) {
        if (user.getUsername().equals("Hellsinner") && user.getPassword().equals("123456")){
            LOGGER.info("登录成功,username:{}", user.getUsername());
            return ResponseDto.ok("登录成功");
        }else {
            LOGGER.info("用户名密码错误,username:{}",user.getUsername());
            return ResponseDto.build(10010, "用户名密码错误");
        }
    }
}
