package com.dev.service;


import com.dev.entity.User;
import com.dev.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;
/**
 * Service
 * @author 路飞
 * @create 2021/1/5
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userDao;
    @Autowired
    private RedisTemplate redisTemplate;


    //查所有用户
    public List<User> queryAll(){
        return userDao.queryAll();
    }

    /**
     * 获取用户策略:先从缓存中获取用户，没有则读mysql数据，再将数据写入缓存
     */
    public User findUserById(int id){
        String key = "user_"+id;
        ValueOperations<String,User> operations = redisTemplate.opsForValue();
        //判断redis中是否有键为key的缓存
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            User user = operations.get(key);
            System.out.println("从缓存中获取数据:"+user.getUserName());
            System.out.println("-----------------------------");
            return user;
        }else{
            User user = userDao.findUserById(id);
            if (user != null){
                System.out.println("查询数据库获取数据:"+user.getUserName());
                System.out.println("------------写入缓存---------------------");
                //写入缓存
                operations.set(key,user,5, TimeUnit.HOURS);
                return user;
            }
            return null;
        }
    }

    //删除用户策略:删除数据表中数据，然后删除缓存
    public int deleteUserById(int id){
        int result = userDao.deleteUserById(id);
        String key = "user_"+id;
        if(result!=0){
            boolean hasKey = redisTemplate.hasKey(key);
            if(hasKey){
                redisTemplate.delete(key);
                System.out.println("删除了缓存中的key:"+key);
            }
        }
        return result;
    }

    /**
     * 更新用户策略：先更新数据表，成功之后，删除原来的缓存，再更新缓存
     */
    public int updateUser(User user) {
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        int result = userDao.updateUser(user);
        if (result != 0) {
            String key = "user_" + user.getId();
            boolean haskey = redisTemplate.hasKey(key);
            if (haskey) {
                redisTemplate.delete(key);
                System.out.println("删除缓存中的key-----------> " + key);
            }
            // 再将更新后的数据加入缓存
            User userNew = userDao.findUserById(user.getId());
            if (userNew != null) {
                operations.set(key, userNew, 3, TimeUnit.HOURS);
            }
        }
        return result;
    }
}
