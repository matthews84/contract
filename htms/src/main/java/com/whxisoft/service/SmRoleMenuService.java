package com.whxisoft.service;

import com.whxisoft.pojo.SmRoleMenu;

import java.util.List;

public interface SmRoleMenuService extends BaseService<SmRoleMenu> {
    //角色用户关联表中数据
    int insertRoleMenu(SmRoleMenu SmRoleMenu);

    //查询已经选中的节点
    List<String> queryBypkrole(String id);
}
