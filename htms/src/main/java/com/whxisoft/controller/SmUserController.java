package com.whxisoft.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.whxisoft.constant.SystemConstants;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.log.Log;
import com.whxisoft.pojo.SmUser;
import com.whxisoft.service.SmUserRoleService;
import com.whxisoft.service.SmUserService;
import com.whxisoft.util.DateUtil;
import com.whxisoft.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/idm_sm_user")
public class SmUserController extends BaseContoller {
    @Autowired
    private SmUserService smUserService;

    @Autowired
    private SmUserRoleService userRoleService;

    @Log(module = "登录")
    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, Object> map, HttpSession session) {
        Map<String, Object> loginMap = smUserService.getUserByAccount((String) map.get("username"), (String) map.get("password"));
        if (SystemConstants.LOGIN_SUCCESS.equals(loginMap.get("code"))) {
            session.setAttribute("user", loginMap.get("user"));
            SmUser bdUser = (SmUser) session.getAttribute("user");
            bdUser.setLogindate(DateUtil.getCurrentTime());
            smUserService.update(bdUser);
        }
        return loginMap;
    }

    @GetMapping("/logout")
    public Map<String, Object> logout(HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        try {
            session.removeAttribute("user");
            map.put("code", SystemConstants.SUCCESS);
            map.put("msg", "退出登录成功！");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", SystemConstants.FAIL);
            map.put("msg", "退出登录失败！");

        }
        return map;
    }

    /*
     * 查询页面数据(页面模糊查询)
     * */
    @PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, @ModelAttribute SmUser user) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<SmUser> users = smUserService.getByCond(user);
        return list2Map(users, dataTables);
    }

    @GetMapping("/getSession")
    public Map<String, Object> getSession(HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        SmUser user = (SmUser) session.getAttribute("user");

        if (ObjectUtils.isEmpty(user)) {
            map.put("code", SystemConstants.FAIL);
            map.put("msg", "请先登录！");
        } else {
            map.put("code", SystemConstants.SUCCESS);
            map.put("msg", "");
        }

        return map;
    }

    @PostMapping("/checkSession")
    @ResponseBody
    public Map<String, Object> checkSession(HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        SmUser bdUser = (SmUser) session.getAttribute("user");

        map.put("flag", ObjectUtils.isEmpty(bdUser));
        return map;
    }

    @Log(module = "修改用户信息")
    @PutMapping("/update/{id}")
    public Map<String, Object> update(@PathVariable String id, @ModelAttribute SmUser user) {
        user.setPk_user(id);
        //加密
        String password = user.getPassword();
        String s = DigestUtils.md5DigestAsHex(password.getBytes());
        user.setPassword(s);
        //获取
        String rolename = user.getRolename();
        if(!StringUtils.isEmpty(rolename)){
            String[] St = rolename.split("@@@");
            user.setRolename(St[0]);
            user.setPk_role(St[1]);
            //修改用户角色关联表里面数据
            userRoleService.updateUserRole(user.getPk_role(), id);
        }
        int rows = smUserService.update(user);
        //修改用户角色关联表里面数据
        //userRoleService.updateUserRole(user.getPk_role(), id);
        return updateResult(rows);
    }

    @Log(module = "添加用户")
    @PostMapping("/add")
    public Map<String, Object> add(@ModelAttribute SmUser user) {
        //加密
        String password = user.getPassword();
        String s = DigestUtils.md5DigestAsHex(password.getBytes());
        user.setPassword(s);
        //设置用户编码
        user.setUsercode(StringUtil.getUUID());
        //设置创建时间
        user.setStartdate(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        //获取
        String rolename = user.getRolename();
        String[] St = rolename.split("@@@");
        user.setRolename(St[0]);
        user.setPk_role(St[1]);
        int rows = smUserService.save(user);
        String pk_user = user.getPk_user();
        System.out.println(pk_user);
        //存放在用户角色关联表中
        userRoleService.saveUserRole(user.getPk_role(), pk_user);
        return saveResult(rows);
    }

    /**
     * 判断用户名是否重复
     *
     * @return
     */
    @PostMapping("/checkUsername")
    public JSONObject cheakUsername(String Username) {
        int count = smUserService.cheakUsername(Username);
        JSONObject object = new JSONObject();
        if (count > 0) {
            object.put("code", SystemConstants.FAIL);
            object.put("msg", "用户名重复！");
            object.put("count", count);
        } else {
            object.put("code", SystemConstants.SUCCESS);
        }
        return object;
    }

    @Log(module = "删除用户信息")
    @PostMapping("/del")
    public Map<String, Object> del(String ids) {
        String[] result = ids.split(",");
        int rows = 0;
        for (int i = 0; i < result.length; i++) {
            rows = smUserService.delete(result[i]);
            userRoleService.delete(result[i]);
        }
        return deleteResult(rows);
    }
}
