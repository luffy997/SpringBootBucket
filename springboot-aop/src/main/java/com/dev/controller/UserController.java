package com.dev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 * @author 路飞
 * @create 2021/1/6
 */
@RestController
public class UserController {

    //first contrller
    @RequestMapping("/first")
    public String first(){
        return "firsr controller";
    }

    //error
    @RequestMapping
    public Object error(){
        return  1/0;
    }


    //seconded controller
    @RequestMapping("/second")
 //   @UserAccess(desc = "second")
    public Object second() {
        return "second controller";
    }


}
