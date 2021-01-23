package com.dev.controller;

import com.dev.entity.TestUser;
import com.dev.entity.User;
import com.dev.service.UserService;
import com.dev.utils.ValidatedGroup;
import com.dev.vo.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * controller层
 * @author 路飞
 * @create 2021/1/23
 */
@RestController
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("/user")
    //@Valid 加入参数校验
    // @Validated 两者基本使用无区别
    /**
     * @Valid----
     * public @interface Valid {
     * }
     *
     * @Validated-----
     * public @interface Validated {
     *     Class<?>[] value() default {};
     * }
     *
     */
    public BaseResponse<Integer> insUser(@RequestBody @Valid User user){

        log.info("表单传值====>"+user);
        Integer integer = userService.registerUser(user);
        return new BaseResponse<>(true,"注册成功",integer);
    }

    /**
     * 修改信息
     * @param testUser
     * @return
     */
    @PostMapping("/updateUser")
    public BaseResponse<Integer> updateUser(@RequestBody  @Validated(value = ValidatedGroup.Update.class) TestUser testUser){
        log.info("表单传值====>"+testUser);
        Integer integer = userService.updateUser(testUser);
        return new BaseResponse<>(true,"修改成功",integer);
    }
}
