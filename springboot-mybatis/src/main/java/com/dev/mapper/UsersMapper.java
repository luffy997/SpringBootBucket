package com.dev.mapper;

import com.dev.entity.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层
 * @author 路飞
 * @create 2021/1/11
 */
@Mapper
@Repository
public interface UsersMapper {

    //测试增删改查
    @Select("SELECT * FROM t_users")
    List<Users> selAllUsers();

    @Select("SELECT * FROM t_users WHERE username = #{username} ")
    Users selUser(String username);

    @Insert("INSERT INTO t_users VALUES(DEFAULT,#{username},#{password},#{salt},now(),now())")
    Integer insUser(Users users);

    @Update("UPDATE t_users SET username = #{username} WHERE id = {id}")
    Integer updUser(String username,Integer id);

    @Delete("DELETE FROM t_users WHERE username =#{username}")
    Integer delUser(String username);

}
