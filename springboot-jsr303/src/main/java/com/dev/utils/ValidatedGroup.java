package com.dev.utils;

import javax.validation.groups.Default;

/**
 * 分组校验
 * @author 路飞
 * @create 2021/1/23
 */
public class ValidatedGroup {
    public interface  Add extends Default {}
    public interface  Delete extends Default {}
    public interface  Update extends Default {}
    public interface  Query extends Default {}
}