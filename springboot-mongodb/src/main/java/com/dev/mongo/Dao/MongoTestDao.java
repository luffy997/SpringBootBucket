package com.dev.mongo.Dao;

import com.dev.mongo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;



/**
 * @author 路飞
 * @create 2021/5/22 10:12
 */
@Component
public class MongoTestDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     * @param user
     */
    public void save(User user){
        mongoTemplate.save(user);
    }

    /**
     * 根据id查询对象
     * @param id
     * @return
     */
    public User findUserById(Integer id){
        Query query = new Query(Criteria.where("name").is(id));
        User user = mongoTemplate.findOne(query, User.class);
        return user;
    }

    public void updateUserById(User user){
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("age", user.getAge()).set("name", user.getName());
        //更新查询结果中的第一条数据
        mongoTemplate.updateFirst(query,update,User.class);
    }

    /**
     * 根据id删除
     * @param id
     */
    public void deleteUserById(Integer id){
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,User.class);
    }
}
