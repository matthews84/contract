package com.whxisoft.service;

import com.whxisoft.pojo.SmMenu;

import java.util.List;

public interface SmMenuService extends BaseService<SmMenu> {
    //查询菜单或者目录
    List<SmMenu> getMenuBtn(String lev);
    //查询按钮
    List<SmMenu> getBtn(String code);
}
