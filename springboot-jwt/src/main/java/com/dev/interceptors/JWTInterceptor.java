package com.dev.interceptors;

import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.dev.utils.JWTUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * JWT拦截器
 * @author 路飞
 * @create 2021/1/2
 */

public class JWTInterceptor implements HandlerInterceptor{


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        //获取请求头中的令牌
        String token = request.getHeader("token");
        try {
            JWTUtils.verify(token);
            return true; //放行
        } catch (TokenExpiredException e) {
            e.printStackTrace();
            map.put("msg", "Token已经过期!!!");
        } catch (SignatureVerificationException e){
            e.printStackTrace();
            map.put("msg", "签名错误!!!");
        } catch (AlgorithmMismatchException e){
            e.printStackTrace();
            map.put("msg", "加密算法不匹配!!!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("msg", "无效token~~");
        }
        map.put("state",false);//设置状态
        //将map 专为json  jackson
        String json = new ObjectMapper().writeValueAsString(map);
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().println(json);
        return false;

    }
}
