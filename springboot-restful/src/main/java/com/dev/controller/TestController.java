package com.dev.controller;

import com.dev.vo.BaseResponse;
import com.dev.model.UserTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 接口
 * @author 路飞
 * @create 2021/1/5
 */
@RestController
@RequestMapping(value = "/users")
@Slf4j
public class TestController {

    //创建一个线程安全的map
     private static Map<Long, UserTest> users =  Collections.synchronizedMap(new HashMap<Long, UserTest>());


     @RequestMapping(value = "/" , method = RequestMethod.GET)
    public BaseResponse<List<UserTest>> getUserList(){
         // 处理"/users/"的GET请求，用来获取用户列表
         // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<UserTest> list = new ArrayList<>(TestController.users.values());
        log.info("查询成功");
        return new BaseResponse<>(true,"查询成功",list);
    }

    @RequestMapping(value = "/" , method = RequestMethod.POST)
    public BaseResponse<String> postUser(@ModelAttribute UserTest user){
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
         users.put(user.getId(),user);
         return new BaseResponse<>(true,"新增成功","200");

    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public BaseResponse<UserTest> getUser(@PathVariable Long id){
         //处理“/users/{id}”的get请求，用来获取url中的id值的user信息
        //url中的id可以通过@Path Variable绑定到函数的参数中
        return new BaseResponse<>(true,"查询成功",users.get(id));
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public BaseResponse<String> putUser(@PathVariable Long id,@ModelAttribute UserTest user){
         //处理“/user/{id}”的put请求，用来更新User
        UserTest u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id,u);
        return new BaseResponse<>(true,"更新成功","200");
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public BaseResponse<String> deleteUser(@PathVariable Long id){
         //处理“/users/{id}”的DELETE请求，删除user
        users.remove(id);
        return new BaseResponse<>(true,"删除成功","200");
    }

}
