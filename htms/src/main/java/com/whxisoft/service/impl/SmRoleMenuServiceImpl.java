package com.whxisoft.service.impl;

import com.whxisoft.mapper.SmRoleMenuMapper;
import com.whxisoft.pojo.SmRoleMenu;
import com.whxisoft.service.SmRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SmRoleMenuServiceImpl extends BaseServiceImpl<SmRoleMenu> implements SmRoleMenuService {
    @Autowired
    private SmRoleMenuMapper roleMenuMapper;

    //存入角色菜单关联表中
    @Override
    public int insertRoleMenu(SmRoleMenu SmRoleMenu) {
        return roleMenuMapper.insertRoleMenu(SmRoleMenu);
    }

    //查询已经选中的节点
    @Override
    public List<String> queryBypkrole(String id) {
        return roleMenuMapper.queryBypkrole(id);
    }
}
