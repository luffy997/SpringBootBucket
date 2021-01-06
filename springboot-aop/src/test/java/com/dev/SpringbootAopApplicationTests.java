package com.dev;

import com.dev.service.CheckUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SpringbootAopApplicationTests {

  //  private final Logger log = LoggerFactory.getLogger(SpringbootAopApplicationTests.class);


    @Autowired
    private CheckUserService checkUserService;




    //调用删除 会先check
    @Test
   public void contextLoads() throws Exception {
        checkUserService.delete();
    }

    //测试日志 默认打印info级别及其以上 debug不包括
    @Test
    public void testLog() throws Exception {
        String username = "Luffy";
        String password = "1234";
        log.info("info");
        log.debug("debug");
        log.error("error");
        log.error("用户名：{}，密码：{}",username,password);
    }

}
