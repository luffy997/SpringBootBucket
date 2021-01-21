package com.dev;

import com.dev.controller.GoodsController;
import com.dev.entity.Goods;
import com.dev.service.GoodsService;
import com.dev.vo.BaseResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SpringbootSwaggerApplicationTests {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private GoodsController goodsController;

    @Test
    void test1() {
        BaseResponse<List<Goods>> list = goodsController.showGoodsList();
        System.out.println(list);
    }

}
