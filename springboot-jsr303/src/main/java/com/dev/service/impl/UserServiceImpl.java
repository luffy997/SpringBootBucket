package com.dev.service.impl;

import com.dev.entity.TestUser;
import com.dev.entity.User;
import com.dev.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 路飞
 * @create 2021/1/23
 */
@Service
public class UserServiceImpl implements UserService {

    //这里本应该应该注入Mapper，操作数据库，这里简化下操作，不连数据库

  @Override
    public Integer registerUser(User user) {
        return 200;
    }

    @Override
    public Integer updateUser(TestUser testUser) {
        return 200;
    }

}
