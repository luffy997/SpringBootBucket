package com.dev.controller;

import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.dev.entity.Users;
import com.dev.service.UsersService;
import com.dev.utils.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 路飞
 * @create 2021/1/2
 */
@RestController
@Slf4j
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 用户登录
     * @param users
     * @return
     */
    @GetMapping("/user/login")
    public Map<String,Object> login(Users users){
        log.info("用户名："+users.getUsername());
        log.info("密码："+users.getPassword());
        HashMap<String, Object> map = new HashMap<>();
        Users user = usersService.selUserByPwd(users);
        if (user != null){
            HashMap<String, String> payload = new HashMap<>();
            payload.put("uid",user.getUid().toString());
            payload.put("username",user.getUsername());
            String token = JWTUtils.getToken(payload);
            map.put("state",true);
            map.put("msg","认证成功");
            map.put("token",token);
        }else {
            map.put("state",false);
            map.put("msg","认证失败");
        }
        return map;
    }


    /**
     *
     * @param
     * @return
     */
    @PostMapping("/user/test")
    public Map<String,Object> test(HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        //处理业务
        String token = request.getHeader("token");
        DecodedJWT verify = JWTUtils.verify(token);
        log.info("用户名："+verify.getClaim("uid").asInt());
        log.info("密码："+verify.getClaim("username").asString());
        map.put("state",true);
        map.put("msg","请求成功!");
        return map;
    }
}
