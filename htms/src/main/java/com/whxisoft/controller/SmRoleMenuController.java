package com.whxisoft.controller;

import com.whxisoft.service.SmRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/services/idm_sm_rolemenu")
public class SmRoleMenuController extends BaseContoller {
    @Autowired
    private SmRoleMenuService roleMenuService;

    /*
     * 查询已经选中的节点
     * */
    @PostMapping("/queryBypkrole/{id}")
    public List<String> queryBypkrole(@PathVariable String id) {
        return roleMenuService.queryBypkrole(id);
    }

}
