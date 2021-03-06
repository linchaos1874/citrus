package com.github.yiuman.citrus.system.dto;

import com.github.yiuman.citrus.support.crud.query.QueryParam;
import lombok.Data;

import java.util.List;

/**
 * 角色列表查询类
 *
 * @author yiuman
 * @date 2020/4/6
 */
@Data
public class RoleQuery {

    @QueryParam(type = "like")
    private String roleName;

    private List<Long> authIds;
}
