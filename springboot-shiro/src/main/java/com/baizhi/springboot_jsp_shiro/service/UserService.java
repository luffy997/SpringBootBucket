package com.baizhi.springboot_jsp_shiro.service;

import com.baizhi.springboot_jsp_shiro.entity.Perms;
import com.baizhi.springboot_jsp_shiro.entity.Role;
import com.baizhi.springboot_jsp_shiro.entity.User;

import java.util.List;


public interface UserService {
    //注册用户
    void register(User user);

    //用户名查询
    User findByUserName(String username);

    //根据用户名查询角色
    User findRolesByUserName(String username);

    //根据角色id查询权限集合
    List<Perms> findPermsByRoleId(Integer id);
}
