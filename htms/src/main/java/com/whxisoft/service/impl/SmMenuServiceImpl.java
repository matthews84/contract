package com.whxisoft.service.impl;

import com.whxisoft.mapper.SmMenuMapper;
import com.whxisoft.pojo.SmMenu;
import com.whxisoft.service.SmMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class SmMenuServiceImpl extends BaseServiceImpl<SmMenu> implements SmMenuService {

    @Autowired
    private SmMenuMapper menuMapper;

    //菜单 或者 目录查询
    @Override
    public List<SmMenu> getMenuBtn(String lev) {
        return menuMapper.getMenuBtn(lev);
    }
    //查询按钮
    @Override
    public List<SmMenu> getBtn(String code) {
        return menuMapper.getBtn(code);
    }


}
