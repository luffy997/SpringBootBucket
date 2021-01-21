package com.dev.controller;


import com.dev.entity.User;
import com.dev.service.UserService;
import com.dev.vo.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * 控制器
 * @author 路飞
 * @create 2021/1/5
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询全部
     * @return
     */
    @GetMapping("/")
    public BaseResponse<List<User>> showAll(){
        List<User> lists = userService.queryAll();
        return new BaseResponse<>(true,"查询成功",lists);
    }

    /**
     * 查询用户
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public BaseResponse<User> selUser(@PathVariable Integer id){
        User user = userService.findUserById(id);
        return new BaseResponse<>(true,"查询成功",user);
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @PutMapping("/")
    public BaseResponse<Integer> updUser(@ModelAttribute User user){
        int i = userService.updateUser(user);
        if (i > 0){
            return new BaseResponse<>(true,"更新成功",200);
        }else {
            return new BaseResponse<>(true,"更新失败",500);
        }
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public BaseResponse<Integer> delUser(@PathVariable Integer id){
        int i = userService.deleteUserById(id);
        if (i > 0){
            return new BaseResponse<>(true,"删除成功",200);
        }else {
            return new BaseResponse<>(true,"删除失败",500);
        }
    }
}
