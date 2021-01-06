package com.dev.controller;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dev.mapper.UserMapper;
import com.dev.vo.BaseResponse;
import com.dev.model.User;
import com.dev.service.UserService;

import io.swagger.annotations.ApiOperation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 路飞
 * @since 2021-01-05
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询全部
     * @return
     */
    @ApiOperation("查询全部")
    @GetMapping("/getAll")
    public BaseResponse<List<User>> getAll(){
        List<User> list = userService.list(null);
        return new BaseResponse<>(true,"查询成功",list);

    }

    /**
     *根据id查
     * @param id
     * @return
     */
    @ApiOperation("根据id查询")
    @GetMapping("/{id}")
    public BaseResponse<User> getById(@PathVariable Long id){
        User user = userService.getById(id);
        return new BaseResponse<>(true,"查询成功",user);

    }

    /**
     * 根据id删除
    * @param id
     * @return
     */
    @ApiOperation("根据id删除")
    @DeleteMapping("/{id}")
    public BaseResponse<String> dellteUser(@PathVariable Long id){
        userService.removeById(id);
        return new BaseResponse<>(true,"删除成功","200");
    }


    /**
     * 根据id更新
     * @param id
     * @return
     */
    @ApiOperation("根据id更新")
    @PutMapping("/{id}")
    public BaseResponse<String> updateUser(@PathVariable Long id,@ModelAttribute User user){
        userService.updateById(user);
        log.info("更新成功");
        return new BaseResponse<>(true,"更新成功","200");

    }

    /**
     * 插入数据
     * @param user
     * @return
     */
    @ApiOperation("插入数据")
    @PostMapping("/")
    public BaseResponse<String> insUser(@ModelAttribute User user){
        userService.save(user);

        return new BaseResponse<>(true,"插入成功","200");

    }

    /**
     * 测试乐观锁
     * @param id
     * @param user
     * @return
     */
    @ApiOperation("测试乐观锁")
    @PostMapping("/{id}")
     public BaseResponse<User> insUser(@PathVariable Long id,@ModelAttribute User user){
        //先拿数据，再更新，乐观锁才起作用
        User users = userService.getById(id);
        userService.updateById(user);
        User userServiceById = userService.getById(id);
        return new BaseResponse<>(true,"成功",userServiceById);
    }

    /**
     * 分页显示
     * @param pageNo
     * @return
     */
    @ApiOperation("分页查询")
    @GetMapping("/pageInfo/{pageNo}")
    public BaseResponse<List<User>> pageInfoUser(@PathVariable int pageNo){
        //默认每页5个
        //  参数一：当前页
        //  参数二：页面大小
        Page<User> page = new Page<>(pageNo, 5);
        userService.page(page, null);
        List<User> list = page.getRecords();
        return new BaseResponse<>(true,"查询成功",list);
    }
}

