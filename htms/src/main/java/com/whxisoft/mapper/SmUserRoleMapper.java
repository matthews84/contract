package com.whxisoft.mapper;

import com.whxisoft.pojo.SmMenu;
import com.whxisoft.pojo.SmUserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmUserRoleMapper extends BaseMapper<SmUserRole> {
    SmUserRole query(@Param("pk_role") String pk_role);

    //查询菜单列表
    List<SmMenu> getByMenu(@Param("pk_user") String pk_user, @Param("lev") int lev);

    //查询所有的按钮
    List<SmMenu> getBtn(@Param("pk_user") String pk_user, @Param("pk_menu") String pk_menu);
}
