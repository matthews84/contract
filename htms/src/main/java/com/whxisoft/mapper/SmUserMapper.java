package com.whxisoft.mapper;

import com.whxisoft.pojo.SmUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SmUserMapper extends BaseMapper<SmUser> {
    int cheakUsername(String username);

    SmUser getUserByAccount(String username);

    SmUser getUsername(String username);
}
