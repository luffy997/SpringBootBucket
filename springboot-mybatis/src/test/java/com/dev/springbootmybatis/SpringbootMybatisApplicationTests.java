package com.dev.springbootmybatis;

import com.dev.service.UsersService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootMybatisApplicationTests {

    private static Logger logger = LoggerFactory.getLogger(SpringbootMybatisApplicationTests.class);

    @Autowired
    private UsersService usersService;

    @Test
    public void showAll() {
        //lambadas表达式
        logger.info("-----------查询全部-------------");
        usersService.selAllUsers().forEach(System.out::println);
    }

}
