package com.whxisoft.service.impl;

import com.whxisoft.mapper.SmUserRoleMapper;
import com.whxisoft.pojo.SmMenu;
import com.whxisoft.pojo.SmUserRole;
import com.whxisoft.service.SmUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SmUserRoleServiceImpl extends BaseServiceImpl<SmUserRole> implements SmUserRoleService {
    @Autowired
    private SmUserRoleMapper userRoleMapper;

    /*
     * 查询菜单
     * */
    @Override
    public List<SmMenu> getByMenu(String pk_user, int lev) {
        return userRoleMapper.getByMenu(pk_user, lev);
    }

    @Override
    public int updateUserRole(String pk_role, String pk_user) {
        //删除关联表里面的数据
        userRoleMapper.delete(pk_user);
        SmUserRole userRole = new SmUserRole();
        userRole.setPk_user(pk_user);
        userRole.setPk_role(pk_role);
        return userRoleMapper.save(userRole);
    }

    @Override
    public SmUserRole query(String pk_role) {
        return userRoleMapper.query(pk_role);
    }

    //用户角色关联表保存
    @Override
    public int saveUserRole(String pk_role, String pk_user) {
        SmUserRole userRole = new SmUserRole();
        userRole.setPk_user(pk_user);
        userRole.setPk_role(pk_role);
        return userRoleMapper.save(userRole);
    }

    //根据用户pk_user 和 pcode查询按钮
    @Override
    public List<SmMenu> getBtn(String pk_user, String pk_menu) {
        return userRoleMapper.getBtn(pk_user, pk_menu);
    }

}
