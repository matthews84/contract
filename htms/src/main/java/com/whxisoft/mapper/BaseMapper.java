package com.whxisoft.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseMapper<T> {
    int save(T t);

    int deleteAll();

    int delete(String id);

    List<T> getAll();

    List<T> getByCond(T t);

    T getById(String id);

    T queryById(Integer id);

    int update(T t);
}
