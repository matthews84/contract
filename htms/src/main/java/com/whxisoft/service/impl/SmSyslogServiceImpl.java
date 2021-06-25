package com.whxisoft.service.impl;

import com.whxisoft.mapper.SmSyslogMapper;
import com.whxisoft.pojo.SmSyslog;
import com.whxisoft.pojo.SmUser;
import com.whxisoft.service.SmSyslogService;
import com.whxisoft.util.DateUtil;
import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

@Service
@Transactional(rollbackFor = Exception.class)
public class SmSyslogServiceImpl extends BaseServiceImpl<SmSyslog> implements SmSyslogService {

    @Autowired
    private SmSyslogMapper smSyslogMapper;


    public void put(JoinPoint joinPoint, String methodName, String module, SmUser user) {
        try {
            SmSyslog log = new SmSyslog();

            log.setFunname(module);
            log.setPk_user(ObjectUtils.isEmpty(user) ? "" : user.getPk_user());
            log.setUsername(ObjectUtils.isEmpty(user) ? "" : user.getRealname());
            log.setOpertime(DateUtil.getCurrentTime());
            smSyslogMapper.save(log);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
