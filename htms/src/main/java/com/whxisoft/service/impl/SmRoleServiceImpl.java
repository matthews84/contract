package com.whxisoft.service.impl;

import com.whxisoft.constant.SystemConstants;
import com.whxisoft.mapper.SmRoleMapper;
import com.whxisoft.pojo.SmRole;
import com.whxisoft.service.SmRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class SmRoleServiceImpl extends BaseServiceImpl<SmRole> implements SmRoleService {
    @Autowired
    private SmRoleMapper smRoleMapper;

    @Override
    public Map<String, Object> getUsername(String username) {
        Map<String, Object> map = new HashMap<>();
        SmRole user = smRoleMapper.getUsername(username);
        if (user != null) {
            map.put("code", SystemConstants.FAIL);
            map.put("msg", "用户名被占用");
        }
        return map;
    }

    @Override
    public List<SmRole> getRoleByStatus() {
        return smRoleMapper.getRoleByStatus();
    }

    @Override
    public int checkRolename(String rolename) {
        return smRoleMapper.checkRolename(rolename);
    }


}
