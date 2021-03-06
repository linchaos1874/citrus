package com.github.yiuman.citrus.support.crud.query;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.servlet.http.HttpServletRequest;

/**
 * 查询条件接口
 *
 * @author yiuman
 * @date 2020/7/23
 */
public interface Condition<T> {

    /**
     * 根据当前请求获取查询条件Wrapper
     *
     * @param request 当前请求
     * @return 查询条件QueryWrapper
     * @throws Exception 可能为反射异常
     */
    QueryWrapper<T> getQueryWrapper(HttpServletRequest request) throws Exception;
}