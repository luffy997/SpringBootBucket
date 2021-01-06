package com.dev.service;

import com.dev.entity.Users;

import java.util.List;

/**
 * @author 路飞
 * @create 2021/1/2
 */
public interface UsersService {
    Users selUserByPwd(Users users);

    List<Users> showAll();


}
