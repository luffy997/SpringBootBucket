package com.dev.service;

import com.dev.annotation.AdminOnly;
import org.springframework.stereotype.Service;

/**
 * @author 路飞
 * @create 2021/1/6
 */
@Service
public class CheckUserService {


    public void check() throws Exception{
        System.out.println("check you------");
    }


    public void delete() throws Exception{
        System.out.println("删除成功");
    }

    public void ins() throws  Exception{
        System.out.println("新增成功");
    }

    public void sel() throws Exception{
        System.out.println("查询成功");
    }

    public void update() throws Exception{
        System.out.println("更新成功");
    }
}
