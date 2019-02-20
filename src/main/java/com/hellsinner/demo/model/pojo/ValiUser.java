package com.hellsinner.demo.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValiUser {
    private String username;

    @Range(min = 1,max = 100,message = "123")
    private int age;
}
