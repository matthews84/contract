package com.whxisoft.service;

import com.whxisoft.pojo.SmSyslog;
import com.whxisoft.pojo.SmUser;
import org.aspectj.lang.JoinPoint;


public interface SmSyslogService extends BaseService<SmSyslog> {

    void put(JoinPoint joinPoint, String methodName, String module, SmUser smUser);
}
