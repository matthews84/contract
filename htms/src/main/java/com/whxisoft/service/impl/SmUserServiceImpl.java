package com.whxisoft.service.impl;

import com.whxisoft.constant.SystemConstants;
import com.whxisoft.mapper.SmUserMapper;
import com.whxisoft.pojo.SmUser;
import com.whxisoft.service.SmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class SmUserServiceImpl extends BaseServiceImpl<SmUser> implements SmUserService {
    @Autowired
    private SmUserMapper smUserMapper;

    @Override
    public Map<String, Object> getUserByAccount(String account, String password) {
        String pwd = DigestUtils.md5DigestAsHex(password.getBytes());
        Map<String, Object> map = new HashMap<>();

        SmUser user = smUserMapper.getUserByAccount(account);

        if (ObjectUtils.isEmpty(user)) {
            map.put("code", SystemConstants.ACCOUNT_NOTFOUND);
            map.put("msg", "用户不存在！");
        } else {
            if ("1".equals(user.getStatus())) {
                map.put("code", SystemConstants.LOGIN_ERROR);
                map.put("msg", "禁用账户");
            } else {
                if (pwd.equals(user.getPassword())) {
                    map.put("code", SystemConstants.LOGIN_SUCCESS);
                    map.put("msg", "登录成功！");
                    map.put("user", user);
                    map.put("password", password);
                } else {
                    map.put("code", SystemConstants.LOGIN_ERROR);
                    map.put("msg", "密码错误！");
                }
            }

        }

        return map;
    }

    @Override
    public Map<String, Object> getUsername(String username) {
        Map<String, Object> map = new HashMap<>();
        SmUser user = smUserMapper.getUsername(username);
        if (user != null) {
            map.put("code", SystemConstants.FAIL);
            map.put("msg", "用户名被占用");
        }
        return map;
    }

    @Override
    public int cheakUsername(String username){
        return smUserMapper.cheakUsername(username);
    }
}
