package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.whxisoft.constant.SystemConstants;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.log.Log;
import com.whxisoft.pojo.SmRole;
import com.whxisoft.pojo.SmRoleMenu;
import com.whxisoft.pojo.SmUserRole;
import com.whxisoft.service.SmRoleMenuService;
import com.whxisoft.service.SmRoleService;
import com.whxisoft.service.SmUserRoleService;
import com.whxisoft.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/idm_sm_role")
public class SmRoleController extends BaseContoller {
    @Autowired
    private SmRoleService roleService;
    @Autowired
    private SmRoleMenuService roleMenuService;
    @Autowired
    private SmUserRoleService userRoleService;

    /*
     * 查询出所有的角色集合
     * */
    @PostMapping("/queryRole")
    public List<SmRole> listRole() {
        return roleService.getRoleByStatus();
    }

    @PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, @ModelAttribute SmRole role) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<SmRole> roles = roleService.getByCond(role);
        return list2Map(roles, dataTables);
    }

    /*
     * 角色添加
     * */
    @Log(module = "添加角色信息")
    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody Map<String, String> map) {
        //获取前台的角色实体类
        String info = map.get("Info");
        SmRole role = JSON.parseObject(info, SmRole.class);
        //获取选中节点
        String ids = map.get("ids");
        String[] str = ids.split(",");
        //生成角色编码
        role.setRolecode(StringUtil.getUUID());
        int rows = roleService.save(role);
        //获取角色pk_role的值
        String pk_role = role.getPk_role();
        System.out.println(pk_role);
        //保存数据到角色 菜单关联
        int rows1 = 0;
        for (String s : str) {
            SmRoleMenu smRoleMenu = new SmRoleMenu();
            smRoleMenu.setPk_role(role.getPk_role());
            smRoleMenu.setPk_menu(s);
            rows1 = roleMenuService.insertRoleMenu(smRoleMenu);
        }
        return saveResult(rows1);
    }

    /*
     * 修改
     * */
    @Log(module = "修改角色信息")
    @PostMapping("/update")
    public Map<String, Object> update(@RequestBody Map<String, String> map) {

        String status = map.get("status");
        //获取角色的更改pk_role
        String id = map.get("pk");
        //获取前台的角色实体类
        String info = map.get("Info");
        SmRole role = JSON.parseObject(info, SmRole.class);
        role.setPk_role(id);
        role.setStatus(status!=null?status:"0");
        int update = roleService.update(role);
        //删除所有角色菜单关联表的role数据
        roleMenuService.delete(id);
        //获取节点
        String ids = map.get("ids");
        String[] str = ids.split(",");
        //添加数据到角色菜单关联表中
        int rows1 = 0;
        for (String s : str) {
            SmRoleMenu smRoleMenu = new SmRoleMenu();
            smRoleMenu.setPk_role(id);
            smRoleMenu.setPk_menu(s);
            rows1 = roleMenuService.insertRoleMenu(smRoleMenu);
        }
        return updateResult(rows1);
    }

    /*
     * 验证角色名称重复
     * */
    @PostMapping("/checkRolename")
    public JSONObject checkRolename(String rolename) {
        int count = roleService.checkRolename(rolename);
        JSONObject object = new JSONObject();
        if (count > 0) {
            object.put("code", SystemConstants.FAIL);
            object.put("msg", "角色名称重复！");
            object.put("count", count);
        } else {
            object.put("code", SystemConstants.SUCCESS);
        }
        return object;
    }


    @PostMapping("/register1")
    public Map<String, Object> register1(@RequestBody Map<String, Object> map) {
        Map<String, Object> loginMap = roleService.getUsername((String) map.get("val"));
        return loginMap;
    }

    /*
     * 删除
     * */
    @Log(module = "删除角色信息")
    @PostMapping("/del")
    public Map<String, Object> del(String ids) {
        Map<String, Object> map = new HashMap<>();
        String[] result = ids.split(",");
        int rows = 0;
        String name = "";
        for (int i = 0; i < result.length; i++) {
            SmUserRole query = userRoleService.query(result[i]);
            if (query != null) {
                SmRole role = roleService.getById(query.getPk_role());
                name += role.getRolename();
                if (i != result.length - 1) {
                    name += ";";
                }
                map.put("code", SystemConstants.FAIL);
                map.put("msg", name + "该角色有用户使用！");
            } else {
                rows = roleService.delete(result[i]);
                roleMenuService.delete(result[i]);
                map = deleteResult(rows);
            }
        }
        return map;
    }

}
