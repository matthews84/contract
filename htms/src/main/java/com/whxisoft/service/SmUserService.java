package com.whxisoft.service;

import com.whxisoft.pojo.SmUser;

import java.util.Map;

public interface SmUserService extends BaseService<SmUser> {
    Map<String, Object> getUserByAccount(String account, String password);

    Map<String, Object> getUsername(String username);

    //校验用户名是否存在
    int cheakUsername(String username);
}
