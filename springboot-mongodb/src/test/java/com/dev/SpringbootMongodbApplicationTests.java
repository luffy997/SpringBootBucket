package com.dev;

import com.dev.mongo.Dao.MongoTestDao;
import com.dev.mongo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootMongodbApplicationTests {

    @Autowired
    private MongoTestDao mongoTestDao;

    @Test
    public void addUser() {
        for (int i = 0; i < 100; i++) {
            mongoTestDao.save(new User(i,i,String.valueOf(i+1),String.valueOf(i+100)));
        }
        System.out.println("#####插入完毕！######");
    }

    @Test
    public void updateUser(){
        for (int i = 0; i < 100; i++) {
            mongoTestDao.updateUserById(new User(i,i-1000,"A","a"));
        }
        System.out.println("#####修改完毕！######");
    }

    @Test
    public void deleteUser(){
        for (int i = 0; i < 100; i++) {
            mongoTestDao.deleteUserById(i);
        }
        System.out.println("#####修改完毕！######");
    }

    @Test
    public void findUserById(){
        for (int i = 0; i < 100; i++) {
            User user = mongoTestDao.findUserById(i);
            System.out.println(i+"-----------"+user);
        }
        System.out.println("#####查询完毕！######");
    }

}
