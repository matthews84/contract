package com.whxisoft.controller;

import com.github.pagehelper.PageHelper;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.pojo.SmMenu;
import com.whxisoft.service.SmMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/idm_sm_menu")
public class SmMenuController extends BaseContoller {
    @Autowired
    private SmMenuService menuService;

    @PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, @ModelAttribute SmMenu menu) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<SmMenu> users = menuService.getByCond(menu);
        return list2Map(users, dataTables);
    }

    /*
     * 查询菜单结构（目录  按钮）
     * */
    @PostMapping("/queryByTable")
    public Map<String, Object> queryByTable() {
        //查询所有目录层级
        List<SmMenu> menuBtn1 = menuService.getMenuBtn("1");
//        System.out.println(1);
        //查询所有菜单层级
        List<SmMenu> menuBtn2 = menuService.getMenuBtn("2");
//        System.out.println(2);
        Map<String, List<SmMenu>> menuBtn3 = new HashMap<>();
        for (int a = 0; a <= menuBtn2.size() - 1; a++) {
            String code = menuBtn2.get(a).getCode();
            List<SmMenu> btn3 = menuService.getBtn(code);
            menuBtn3.put("" + a, btn3);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("M1", menuBtn1);
        map.put("M2", menuBtn2);
        map.put("M3", menuBtn3);
        return map;
    }

    /*
     * 查询所有菜单内容
     * */
    @PostMapping("/queryByMenu")
    public List<SmMenu> queryMenu() {
        List<SmMenu> byCond = menuService.getAll();
        return byCond;
    }
}
