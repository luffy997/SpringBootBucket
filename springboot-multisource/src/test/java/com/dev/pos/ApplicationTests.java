package com.dev.pos;

import com.dev.pos.common.dao.entity.User;
import com.dev.pos.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(ApplicationTests.class);

    @Resource
    private UserService userService;

    /**
     * 测试增删改查
     */
    @Test
    public void test() {
        // 核心数据库中的用户id=1
        User user = userService.findById(1);
        log.debug("核心数据库=="+user.getUsername());
        // biz数据库中的用户id=1
        User user1 = userService.findById1(1);
        log.debug("biz数据库=="+user1.getUsername());

    }
}
