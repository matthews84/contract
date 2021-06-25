package com.whxisoft.service;

import com.whxisoft.pojo.SmMenu;
import com.whxisoft.pojo.SmUserRole;

import java.util.List;

public interface SmUserRoleService extends BaseService<SmUserRole> {
    /*
     * 查询菜单或者是按钮
     * */
    List<SmMenu> getByMenu(String pk_user, int lev);

    //用户关联表修改
    int updateUserRole(String pk_role, String pk_user);

    SmUserRole query(String pk_role);

    //用户角色关联表
    int saveUserRole(String pk_role, String pk_user);

    //根据用户pk_user查询所有的按钮
    List<SmMenu> getBtn(String pk_user, String pk_menu);
}
