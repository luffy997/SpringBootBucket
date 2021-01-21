<<<<<<< HEAD
package com.dev.service.impl;

import com.dev.entity.Users;
import com.dev.mapper.UsersMapper;
import com.dev.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Users服务接口实现
 * @author 路飞
 * @create 2021/1/11
 */
@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> selAllUsers() {
        return usersMapper.selAllUsers();
    }

    @Override
    public Users selUser(String username) {
        return usersMapper.selUser(username);
    }

    @Override
    public Integer insUser(Users users) {
        return usersMapper.insUser(users);
    }

    @Override
    public Integer updUser(String username, Integer id) {
        return usersMapper.updUser(username,id);
    }

    @Override
    public Integer delUser(String username) {
        return usersMapper.delUser(username);
    }
}
=======
package com.dev.service.impl;

import com.dev.entity.Users;
import com.dev.mapper.UsersMapper;
import com.dev.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Users服务接口实现
 * @author 路飞
 * @create 2021/1/11
 */
@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> selAllUsers() {
        return usersMapper.selAllUsers();
    }

    @Override
    public Users selUser(String username) {
        return usersMapper.selUser(username);
    }

    @Override
    public Integer insUser(Users users) {
        return usersMapper.insUser(users);
    }

    @Override
    public Integer updUser(String username, Integer id) {
        return usersMapper.updUser(username,id);
    }

    @Override
    public Integer delUser(String username) {
        return usersMapper.delUser(username);
    }
}
>>>>>>> aef151c2ea161a189c137da978edb9889d18e19b
