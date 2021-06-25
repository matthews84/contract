package com.whxisoft.service.impl;

import com.whxisoft.mapper.BaseMapper;
import com.whxisoft.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private BaseMapper<T> baseMapper;

    @Override
    public int save(T t) {
        return baseMapper.save(t);
    }

    @Override
    public int deleteAll() {
        return baseMapper.deleteAll();
    }

    @Override
    public int delete(String id) {
        return baseMapper.delete(id);
    }

    @Override
    public List<T> getAll() {
        return baseMapper.getAll();
    }

    @Override
    public List<T> getByCond(T t) {
        return baseMapper.getByCond(t);
    }

    @Override
    public T getById(String id) {
        return baseMapper.getById(id);
    }

    @Override
    public T queryById(Integer id) {
        return baseMapper.queryById(id);
    }

    @Override
    public int update(T t) {
        return baseMapper.update(t);
    }
}
