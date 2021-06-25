package com.whxisoft.mapper;

import com.whxisoft.pojo.SmRoleMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmRoleMenuMapper extends BaseMapper<SmRoleMenu> {
    //角色菜单表存放
    int insertRoleMenu(SmRoleMenu SmRoleMenu);

    //查询已经选中的节点
    List<String> queryBypkrole(String id);
}
