package com.dev.controller;

import com.dev.entity.Users;
import com.dev.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Users接口层
 * @author 路飞
 * @create 2021/1/11
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 显示所有用户
     * @return
     */
    @GetMapping("/showAll")
    public List<Users> showAllUsers(){
        List<Users> users = usersService.selAllUsers();
        return users;
    }

    /**
     * 查询用户
     * @param username
     * @return
     */
    @PostMapping("/selUser")
    public Users selUser(@RequestParam(value = "username") String username){
        Users users = usersService.selUser(username);
        return users;
    }

    /**
     * 插入用户
     * @return
     */
    @PostMapping("/insUser")
    public Map<String,Object> insUser(@RequestBody Users users){
        Map<String, Object> map = new HashMap<>();
        Integer integer = usersService.insUser(users);
        if (integer > 0 ){
            map.put("code",200);
            map.put("msg","success");
            return map;
        }else {
            map.put("code",100);
            map.put("msg","failed");
            return map;
        }
    }

    /**
     * 修改用户
     * @return
     */
    @PostMapping("/updUser")
    public Map<String,Object> updUser(@RequestParam(value = "id") Integer id,
                                      @RequestParam(value = "username")String username){
        Map<String, Object> map = new HashMap<>();
        Integer integer = usersService.updUser(username,id);
        if (integer > 0 ){
            map.put("code",200);
            map.put("msg","success");
            return map;
        }else {
            map.put("code",100);
            map.put("msg","failed");
            return map;
        }
    }

    /**
     * 删除用户
     * @param username
     * @return
     */
    @PostMapping("/delUser")
    public Map<String,Object> delUser(@RequestParam(value = "username") String username){
        Map<String, Object> map = new HashMap<>();
        Integer integer = usersService.delUser(username);
        if (integer > 0 ){
            map.put("code",200);
            map.put("msg","success");
            return map;
        }else {
            map.put("code",100);
            map.put("msg","failed");
            return map;
        }
    }

}
