package com.dev.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * 用户实体类
 * @author 路飞
 * @create 2021/1/23
 */
@Data
public class User {

    private Integer uid; //主键

    @NotEmpty(message = "姓名不能为空")
    @Length(min = 1,max = 10,message = "长度必须在1-10之间")
    private String name; //姓名

    @NotBlank
    @Pattern(regexp = "^134[0-8]\\d{7}$|^13[^4]\\d{8}$|^14[5-9]\\d{8}$|^15[^4]\\d{8}$|^16[6]\\d{8}$|^17[0-8]\\d{8}$|^18[\\d]{9}$|^19[8,9]\\d{8}$", message = "电话号码格式不正确")
    private String tel; //电话

    @Email(message = "邮件格式不正确")
    @NotEmpty
    private String mail; //邮箱

    @NotBlank
    @Pattern(regexp = "[1-9][0-9]{4,14}", message = "qq格式不正确")
    private String qq; //qq

}
