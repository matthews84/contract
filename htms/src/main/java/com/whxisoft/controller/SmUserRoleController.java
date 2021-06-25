package com.whxisoft.controller;

import com.whxisoft.pojo.SmMenu;
import com.whxisoft.pojo.SmUser;
import com.whxisoft.service.SmUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/idm_sm_userrole")
public class SmUserRoleController extends BaseContoller {
    @Autowired
    private SmUserRoleService userRoleService;

    @PostMapping("/getMenuNode")
    public Map<String, Object> getRole(HttpSession session) {
        SmUser user = (SmUser) session.getAttribute("user");
        Map<String, Object> map = new HashMap<>();
        if (!ObjectUtils.isEmpty(user)) {
            List<SmMenu> father = userRoleService.getByMenu(user.getPk_user(), 1);
            List<SmMenu> children = userRoleService.getByMenu(user.getPk_user(), 2);
            map.put("father", father);
            map.put("children", children);
        }

        return map;
    }

    /*
     * 根据角色和菜单查询按钮
     * */
    @PostMapping("/queryBtnByMenu")
    public List<String> queryBtnByMenu(HttpSession session, @RequestParam("pk_menu") String pk_menu) {
        SmUser user = (SmUser) session.getAttribute("user");

        List<String> btns = new ArrayList<>();
        if (!ObjectUtils.isEmpty(user)) {
            List<SmMenu> menus = userRoleService.getBtn(user.getPk_user(), pk_menu);

            for (SmMenu menu : menus) {
                btns.add(menu.getBtnlabel());
            }
        }

        return btns;
    }

}
