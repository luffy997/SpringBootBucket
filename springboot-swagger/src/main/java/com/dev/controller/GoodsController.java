package com.dev.controller;


import com.dev.entity.Goods;
import com.dev.service.GoodsService;

import com.dev.vo.BaseResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 路飞
 * @since 2021-01-21
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @ApiOperation("列表显示")
    @GetMapping("/")
    public BaseResponse<List<Goods>> showGoodsList(){
        List<Goods> list = goodsService.list(null);
        return new BaseResponse<>(true,"查询成功",list);
    }

    @ApiOperation("查询商品")
    @GetMapping("/{id}")
    public BaseResponse<Goods> selGood(@PathVariable Integer id){
        Goods goods = goodsService.getById(id);
        return new BaseResponse<>(true,"查询成功",goods);
    }

    @ApiOperation("新增商品")
    @PostMapping("/")
    public BaseResponse<Integer> insGood(@RequestBody Goods goods){
        boolean save = goodsService.save(goods);
        if(save == true){
            return new BaseResponse<>(true,"添加成功",200);
        }else {
            return new BaseResponse<>(false,"添加失败",500);
        }
    }

    @ApiOperation("修改商品信息")
    @PutMapping("/{id}")
    public BaseResponse<Integer> updGood(@ModelAttribute Goods goods){
        boolean update = goodsService.updateById(goods);
        if(update == true){
            return new BaseResponse<>(true,"修改成功",200);
        }else {
            return new BaseResponse<>(false,"修改失败",500);
        }
    }

    @ApiOperation("删除商品")
    @DeleteMapping("/{id}")
    public BaseResponse<Integer> delGood(@PathVariable Integer id){
        boolean delete = goodsService.removeById(id);
        if(delete == true){
            return new BaseResponse<>(true,"修改成功",200);
        }else {
            return new BaseResponse<>(false,"修改失败",500);
        }
    }

}

