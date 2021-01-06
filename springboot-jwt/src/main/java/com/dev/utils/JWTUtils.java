package com.dev.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

/**
 * @author 路飞
 * @create 2021/1/2
 */
public class JWTUtils {

    private static  final String SECRET = "!qwer#daD*9)";

    /**
     *生成token
     * @return
     */
    public  static String getToken(Map<String,String> map){
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,7); //默认7天过期

        //创建jwt builder
        JWTCreator.Builder builder = JWT.create();

        //payload
        map.forEach((k,v)->{
                builder.withClaim(k,v);
        });

        String token = builder.withExpiresAt(instance.getTime())//指定过期时间
                        .sign(Algorithm.HMAC256(SECRET)); //sign
        return token;
    }
    /**
     * 验证token 合法性
     *
     */
    public static DecodedJWT verify(String token){
        return JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
    }

//    //验证token合法性
//    public static void verify(String token){
//      JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
//    }

//    /**
//     * 获取token中payload
//     * @param token
//     * @return
//     */
//    public static DecodedJWT getToken(String token){
//        return JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
//    }
}
