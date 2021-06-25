package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.whxisoft.pojo.CmType;
import com.whxisoft.pojo.CmTypeClass;
import com.whxisoft.service.CmTypeClassService;
import com.whxisoft.service.CmTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/ht_cm_typeclass")
public class CmTypeClassController extends BaseContoller {

    @Autowired
    private CmTypeClassService cmTypeClassSerivce;

    @Autowired
    private CmTypeService cmTypeService;

    @PostMapping("/query")
    public List<CmTypeClass> query(@ModelAttribute CmTypeClass cmTypeClass) {
        List<CmTypeClass> cmTypecs = cmTypeClassSerivce.getByCond(cmTypeClass);
        return cmTypecs;
    }

    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody Map<String, String> map) {
        String cmType = map.get("cmType");
        String cmTypeClass = map.get("cmTypeClass");

        CmTypeClass cmTypeClasss = JSON.parseObject(cmTypeClass, CmTypeClass.class);
        List<CmType> cmTypeList = JSON.parseObject(cmType, new TypeReference<List<CmType>>() {
        });
        int rows = cmTypeClassSerivce.save(cmTypeClasss);
        for (CmType ct : cmTypeList) {
            ct.setcClassCode(cmTypeClasss.getcClassCode());
            rows = cmTypeService.save(ct);
        }
        return saveResult(rows);
    }

    @PostMapping("/update/{cClassCode}&{cTypeCode}")
    public Map<String, Object> update(@RequestBody Map<String, String> map, @PathVariable String cClassCode, @PathVariable String cTypeCode) {
        String cmType = map.get("cmType");
        String cmTypeClass = map.get("cmTypeClass");
        CmTypeClass cmTypeClasss = JSON.parseObject(cmTypeClass, CmTypeClass.class);
        List<CmType> cmTypeList = JSON.parseObject(cmType, new TypeReference<List<CmType>>() {
        });
        cmTypeClasss.setcClassCode(cClassCode);
        int rows = cmTypeClassSerivce.update(cmTypeClasss);
        for (CmType ct : cmTypeList) {
            ct.setcTypeCode(cTypeCode);
            ct.setcClassCode(cmTypeClasss.getcClassCode());
            rows = cmTypeService.update(ct);
        }
        return updateResult(rows);
    }

    @ResponseBody
    @PostMapping("/pId")
    public Map<String, Object> GetPid(String id) {
        Map<String, Object> map = new HashMap<>();
        CmTypeClass cmTypeClass = cmTypeClassSerivce.getById(id);
        map.put("cmTypeClass", cmTypeClass);
        return map;
    }

    @ResponseBody
    @PostMapping("/getId")
    public Map<String, Object> getId(String id) {
        Map<String, Object> map = new HashMap<>();
        String num = cmTypeClassSerivce.getId(id);
        if (num == null) {
            num = id + "01";
        } else {
            int i = Integer.parseInt(num);
            num = String.valueOf(i + 1);
            num = "0" + num;
        }
        map.put("id", num);
        return map;
    }

    @PostMapping("/del")
    public Map<String, Object> del(String id, String id2) {
        cmTypeService.delete(id2);
        int rows = cmTypeClassSerivce.delete(id);
        return deleteResult(rows);
    }
}