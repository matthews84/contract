package com.whxisoft.service;

import com.whxisoft.pojo.SmRole;

import java.util.List;
import java.util.Map;

public interface SmRoleService extends BaseService<SmRole> {
    Map<String, Object> getUsername(String username);

    List<SmRole> getRoleByStatus();
    //验证角色名是否为空
    int checkRolename(String rolename);
}
