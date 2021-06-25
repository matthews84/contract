package com.whxisoft.controller;

import com.github.pagehelper.PageInfo;
import com.whxisoft.constant.SystemConstants;
import com.whxisoft.datatables.DataTables;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseContoller {
    public <T> Map<String, Object> list2Map(List<T> list, DataTables dataTables) {
        Map<String, Object> map = new HashMap<>();
        PageInfo<T> pageInfo = new PageInfo<>(list);

        map.put("draw", dataTables.getDraw());
        map.put("recordsTotal", pageInfo.getTotal());
        map.put("recordsFiltered", pageInfo.getTotal());
        map.put("data", list);
//        map.put("error", "没有查询到相关数据！");

        return map;
    }

    public <T> Map<String, Object> procList2Map(List<T> list, int total, DataTables dataTables) {
        Map<String, Object> map = new HashMap<>();

        map.put("draw", dataTables.getDraw());
        map.put("recordsTotal", total);
        map.put("recordsFiltered", total);
        map.put("data", list);
//        map.put("error", "没有查询到相关数据！");

        return map;
    }

    public Map<String, Object> updateResult(int rows) {
        Map<String, Object> map = new HashMap<>();
        if (rows > 0) {
            map.put("code", SystemConstants.SUCCESS);
            map.put("msg", "修改成功！");
        } else {
            map.put("code", SystemConstants.FAIL);
            map.put("msg", "修改失败！");
        }

        return map;
    }

    public Map<String, Object> saveResult(int rows) {
        Map<String, Object> map = new HashMap<>();
        if (rows > 0) {
            map.put("code", SystemConstants.SUCCESS);
            map.put("msg", "新增成功！");
        } else {
            map.put("code", SystemConstants.FAIL);
            map.put("msg", "新增失败！");
        }

        return map;
    }

    public Map<String, Object> saveResult(String data) {
        Map<String, Object> map = new HashMap<>();
        if (!StringUtils.isEmpty(data)) {
            map.put("code", SystemConstants.SUCCESS);
            map.put("msg", "新增成功！");
            map.put("data", data);
        } else {
            map.put("code", SystemConstants.FAIL);
            map.put("msg", "新增失败！");
        }

        return map;
    }

    public Map<String, Object> deleteResult(int rows) {
        Map<String, Object> map = new HashMap<>();
        if (rows > 0) {
            map.put("code", SystemConstants.SUCCESS);
            map.put("msg", "删除成功！");
        } else {
            map.put("code", SystemConstants.FAIL);
            map.put("msg", "删除失败！");
        }

        return map;
    }
}
