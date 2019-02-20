package com.hellsinner.demo.controller;

import com.hellsinner.demo.commponent.VailCom;
import com.hellsinner.demo.model.pojo.User;
import com.hellsinner.demo.model.pojo.ValiUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;

@RestController
public class UserController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setValidator(new VailCom());
    }

    @GetMapping("/mongo/test")
    public User mongo(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        user.setDate(new Date());

        User insert = mongoTemplate.save(user);

        return insert;
    }

    @GetMapping("/vali/test")
    public ValiUser vail(ValiUser valiUser){
        System.out.println(valiUser);
        return valiUser;
    }

    @GetMapping("/valitor/test")
    public ValiUser vailtor(@Valid ValiUser valiUser){
        System.out.println(valiUser);
        return valiUser;
    }
}
