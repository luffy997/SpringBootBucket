package com.dev.service;

import org.springframework.stereotype.Service;

/**
 * @author 路飞
 * @create 2021/1/6
 */
@Service
public class AspectTestService02 {
    public void delete() throws Exception{
        System.out.println("删除成功02");
    }

    public void ins() throws  Exception{
        System.out.println("新增成功02");
     //  throw  new RuntimeException("抛出异常");
    }

    public void sel() throws Exception{
        System.out.println("查询成功02");
    }

    public void update() throws Exception{
        System.out.println("更新成功02");
    }
}
