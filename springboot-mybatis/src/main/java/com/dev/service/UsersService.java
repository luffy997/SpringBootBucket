<<<<<<< HEAD
package com.dev.service;

import com.dev.entity.Users;


import java.util.List;

/**
 * Users服务接口
 * @author 路飞
 * @create 2021/1/11
 */
public interface UsersService {
    List<Users> selAllUsers();

    Users selUser(String username);

    Integer insUser(Users users);

    Integer updUser(String username,Integer id);

    Integer delUser(String username);
}
=======
package com.dev.service;

import com.dev.entity.Users;


import java.util.List;

/**
 * Users服务接口
 * @author 路飞
 * @create 2021/1/11
 */
public interface UsersService {
    List<Users> selAllUsers();

    Users selUser(String username);

    Integer insUser(Users users);

    Integer updUser(String username,Integer id);

    Integer delUser(String username);
}
>>>>>>> aef151c2ea161a189c137da978edb9889d18e19b
