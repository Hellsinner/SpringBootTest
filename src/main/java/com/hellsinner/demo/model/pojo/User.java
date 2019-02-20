package com.hellsinner.demo.model.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User implements Serializable {
    private static final long serialVersionUID = -2660390381757246765L;
    private String id;

    private String username;

    private String password;

    private Date date;
}
