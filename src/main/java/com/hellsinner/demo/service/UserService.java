package com.hellsinner.demo.service;

import com.hellsinner.demo.model.dto.ResponseDto;
import com.hellsinner.demo.model.pojo.User;

public interface UserService {
    public ResponseDto login(User user);
}
