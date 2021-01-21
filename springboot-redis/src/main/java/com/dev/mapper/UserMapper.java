package com.dev.mapper;


import com.dev.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据访问层
 * @author 路飞
 * @create 2021/1/5
 */
@Repository
@Mapper
public interface UserMapper {
    //用户列表
    @Select("select * from t_user")
    List<User> queryAll();

    //根据id获取user
    @Select("select * from t_user where id =#{id}")
    User findUserById(Integer id);

    //根据id修改user
    @Update("update t_user set username=#{userName},sex=#{sex},update_time=now() WHERE id = #{id} ")
    int updateUser(User user);

    //根据id删除用户
    @Delete("delete from t_user where id = #{id}")
    int deleteUserById(Integer id);
}
