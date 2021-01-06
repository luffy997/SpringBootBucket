package com.dev.mapper;

import com.dev.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 路飞
 * @since 2021-01-05
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
