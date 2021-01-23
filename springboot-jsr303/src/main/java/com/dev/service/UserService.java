package com.dev.service;

import com.dev.entity.TestUser;
import com.dev.entity.User;

/**
 * Service 接口
 * @author 路飞
 * @create 2021/1/23
 */
public interface UserService {
    //用户参数
    Integer registerUser(User user);

    //测试分组校验
    Integer updateUser(TestUser testUser);
}
