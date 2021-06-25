package com.whxisoft.service;

import java.util.List;

public interface
BaseService<T> {
    int save(T t);

    int deleteAll();

    int delete(String id);

    List<T> getAll();

    List<T> getByCond(T t);

    T getById(String id);

    T queryById(Integer id);

    int update(T t);
}
