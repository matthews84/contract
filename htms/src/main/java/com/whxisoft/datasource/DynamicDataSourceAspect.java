package com.whxisoft.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author caiChaoqi
 * @Description 动态数据源通知
 * @Date 2018-06-23
 */
@Aspect
@Order(-1)//保证在@Transactional之前执行
@Component
public class DynamicDataSourceAspect {

    private Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    //改变数据源
    @Before("@annotation(targetDataSource)")
    public void changeDataSource(JoinPoint joinPoint, TargetDataSource targetDataSource) {
        String dbid = targetDataSource.name();

        if (!DynamicDataSourceContextHolder.isContainsDataSource(dbid)) {
            //joinPoint.getSignature() ：获取连接点的方法签名对象
            logger.error("数据源 {} 不存在使用默认的数据源 -> {}", dbid, joinPoint.getSignature());
        } else {
            logger.debug("当前数据源: {}", dbid);
            DynamicDataSourceContextHolder.setDataSourceType(dbid);
        }
    }

    @After("@annotation(targetDataSource)")
    public void clearDataSource(JoinPoint joinPoint, TargetDataSource targetDataSource) {
        DynamicDataSourceContextHolder.clearDataSourceType();
        logger.debug("清除数据源: {}", targetDataSource.name());
    }
}