package com.hellsinner.demo.commponent;

import com.hellsinner.demo.model.pojo.ValiUser;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class VailCom implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(ValiUser.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        if (o == null){
            //在参数处报错，不进入到控制器方法中
            errors.reject("",null,"用户不能为空");
            return;
        }

        ValiUser user = (ValiUser) o;
        if (user.getUsername() == null){
            errors.reject("username",null,"用户名不能为空");
        }
    }
}
