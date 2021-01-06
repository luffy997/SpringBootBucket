package com.dev.service.impl;

import com.dev.entity.Users;
import com.dev.mapper.UsersMapper;
import com.dev.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 路飞
 * @create 2021/1/2
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public Users selUserByPwd(Users users) {
        return usersMapper.selUserByPwd(users);
    }

    @Override
    public List<Users> showAll() {
        return usersMapper.showAll();
    }
}
