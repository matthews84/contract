package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.whxisoft.pojo.CmType;
import com.whxisoft.service.CmTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/ht_cm_type")
public class CmTypeController extends BaseContoller {
    @Autowired
    private CmTypeService cmTypeService;

    @PostMapping("/query")
    public String query(@RequestParam("id") String id) {
        return JSON.toJSONString(cmTypeService.getID(id));
    }

    @PostMapping("/query2")
    public List<CmType> query2(@ModelAttribute CmType cmType) {
        List<CmType> roles = cmTypeService.getByCond1(cmType);
        return roles;
    }

    @PostMapping("/add")
    public Map<String, Object> add(@ModelAttribute CmType cmType) {
        int rows = cmTypeService.save(cmType);
        return saveResult(rows);
    }

    @PutMapping("/update/{id}")
    public Map<String, Object> update(@PathVariable String id, @ModelAttribute CmType cmType) {
        cmType.setcClassCode(id);
        int rows = cmTypeService.update(cmType);
        return updateResult(rows);
    }

    @PostMapping("/queryType")
    public List<CmType> listRole(@ModelAttribute CmType cmType) {
        List<CmType> cmTypes = cmTypeService.getByCond1(cmType);
        return cmTypes;
    }
}
