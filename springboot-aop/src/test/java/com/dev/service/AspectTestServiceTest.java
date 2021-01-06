package com.dev.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 路飞
 * @create 2021/1/6
 */
@SpringBootTest
class AspectTestServiceTest {

    @Autowired
    private  AspectTestService01 aspectTestService01;

    @Autowired
    private  AspectTestService02 aspectTestService02;
    @Autowired
    private  AspectTestService03 aspectTestService03;
    @Autowired
    private  AspectTestService04 aspectTestService04;


    @Test
    void delete() {
    }

    @Test
    void test() throws Exception {
        aspectTestService01.ins();
        aspectTestService02.ins();
        aspectTestService03.ins();
        aspectTestService04.ins();

        aspectTestService01.update();
        aspectTestService02.update();
        aspectTestService03.update();
        aspectTestService04.update();

        aspectTestService01.delete();
        aspectTestService02.delete();
        aspectTestService03.delete();
        aspectTestService04.delete();

    }

    @Test
    void sel() {
    }

    @Test
    void update() {
    }
}