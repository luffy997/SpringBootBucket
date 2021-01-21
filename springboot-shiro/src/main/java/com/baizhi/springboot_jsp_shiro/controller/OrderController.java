package com.baizhi.springboot_jsp_shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/save")
   // @RequiresRoles(value = {"user","admin"})//同时具有
    @RequiresPermissions("user:update:01") //用来判断权限字符串
    public String save(){
        Subject subject = SecurityUtils.getSubject();
        if (subject.hasRole("admin")){
            System.out.println("保存订单");
        }else {
            System.out.println("无权访问");
        }
        return "redirect:/index.jsp";
    }
}
