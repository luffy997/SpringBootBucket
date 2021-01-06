package com.dev.mapper;

import com.dev.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 路飞
 * @create 2021/1/2
 */
@Mapper
@Repository
public interface UsersMapper {
    @Select("SELECT * FROM users WHERE username = #{username} AND password = #{password}")
    Users selUserByPwd(Users users);

    @Select("SELECT * FROM users")
    List<Users> showAll();
}
