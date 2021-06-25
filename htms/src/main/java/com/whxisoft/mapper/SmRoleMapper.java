package com.whxisoft.mapper;

import com.whxisoft.pojo.SmRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmRoleMapper extends BaseMapper<SmRole> {
    SmRole getUsername(String username);

    List<SmRole> getRoleByStatus();

    int checkRolename(String rolename);
}
