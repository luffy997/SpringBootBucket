package com.baizhi.springboot_jsp_shiro.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Perms {
    private Integer id;
    private String name;
    private String url;
}
