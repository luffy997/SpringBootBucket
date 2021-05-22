package com.dev.mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 路飞
 * @create 2021/5/22 10:10
 */
@Data
@Document(collation = "user")
public class User {
    @Id
    private Integer id;
    private Integer age;
    private String name;
    private String role;


    public User(Integer id, Integer age, String name, String role) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.role = role;
    }
}
