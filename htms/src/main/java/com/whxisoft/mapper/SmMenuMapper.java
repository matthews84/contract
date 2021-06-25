package com.whxisoft.mapper;

import com.whxisoft.pojo.SmMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmMenuMapper extends BaseMapper<SmMenu> {
    //菜单目录查询
    List<SmMenu> getMenuBtn(String lev);
    //按钮查询
    List<SmMenu> getBtn(String code);
}
