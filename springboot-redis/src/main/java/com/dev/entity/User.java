package com.dev.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * @author 路飞
 * @create 2021/1/5
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String userName;
    private String passWord;
    private Integer sex;
    private Date birthday;
    private Date create_time;
    private Date update_time;
}
