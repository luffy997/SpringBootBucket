package com.dev;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.dev.entity.Users;
import com.dev.service.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.List;


class SpringbootJwtApplicationTests {

    @Autowired
    private UsersService usersService;

    @Test
    void contextLoads() {

        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.SECOND,120);


        //header一般不动
        String token = JWT.create()
                .withClaim("userid",12)
                .withClaim("username","张三") //自定义用户名 密码 payload
                .withExpiresAt(instance.getTime()) //设置过期时间
                .sign(Algorithm.HMAC256("token!Q2W#E$RW")); //设置签名密钥

        System.out.println(token);
    }

    //验证令牌
    @Test
    public  void test(){
        //创建验证对象
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("token!Q2W#E$RW")).build();
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2MDk1OTYxMTgsInVzZXJpZCI6MTIsInVzZXJuYW1lIjoi5byg5LiJIn0.hoXhuapb829-AcVI7T4d7q-KbztWxHyc5JI6DHZMCs4";
        DecodedJWT verify = jwtVerifier.verify(token);
        System.out.println(verify.getClaim("userid").asInt());
        System.out.println(verify.getClaim("username").asString());
//        System.out.println(verify.getClaims().get("userid").asInt());
//        System.out.println(verify.getClaims().get("username").asString());
        System.out.println("过期时间"+verify.getExpiresAt());
    }


}
