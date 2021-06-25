package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.pojo.CmFundPlans;
import com.whxisoft.pojo.CmFundPlansInfo;
import com.whxisoft.pojo.proc.FundPlansSearch;
import com.whxisoft.service.CmFundPlandsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/ht_cm_fundflans")
public class CmFundPlansController extends BaseContoller {
    private static final Logger log = LoggerFactory.getLogger(CmFundPlansController.class);


    @Autowired
    private CmFundPlandsService cmFundPlandsService;


    @PostMapping("/query")
    public String query(@RequestParam("strFundPlanID") String strFundPlanID) {
        return JSON.toJSONString(cmFundPlandsService.queryFundPlands(strFundPlanID));
    }

    @PostMapping("/queryFD")
    public String queryFD(@RequestParam("id") String id) {
        return JSON.toJSONString(cmFundPlandsService.queryFD(id));
    }


    @PostMapping("queryStrFundPlanID")
    public Map<String, Object> queryStrFundPlanID(@RequestParam("strFundPlanID") String strFundPlanID) {
        String num = "001";
        Map<String, Object> map = new HashMap<>();
        String num1 = cmFundPlandsService.queryStrFundPlanID(strFundPlanID);
        //System.out.println(num1);
        if (num1 == null) {
            map.put("id", strFundPlanID + num);
        } else {
            map.put("id", num1);
        }
        return map;
    }

    /*@PostMapping("/queryList")
    public Map<String, Object> queryList(@ModelAttribute DataTables dataTables, @ModelAttribute CmFundPlans fundPlans) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<CmFundPlans> fundPlanss = cmFundPlandsService.getByCond(fundPlans);
        return list2Map(fundPlanss, dataTables);
    }*/
    @PostMapping("/queryList")
    public Map<String, Object> queryList(@ModelAttribute DataTables dataTables, String search) {
        String sql = "";

        if (!StringUtils.isEmpty(search)) {
            FundPlansSearch fundPlansSearch = JSON.parseObject(search, FundPlansSearch.class);

            log.debug("FundPlansSearch -> {}", fundPlansSearch);

            if (!StringUtils.isEmpty(fundPlansSearch.getStrContractID())) {
                sql += " and strContractID like '%" + fundPlansSearch.getStrContractID() + "%'";
            }

            if (!StringUtils.isEmpty(fundPlansSearch.getStrContractName())) {
                sql += " and strContractName like '%" + fundPlansSearch.getStrContractName() + "%'";
            }
            if (!StringUtils.isEmpty(fundPlansSearch.getStrContractType())) {
                sql += " and strContractType like '%" + fundPlansSearch.getStrContractType() + "%'";
            }
            if (!StringUtils.isEmpty(fundPlansSearch.getStrBisectionUnit())) {
                sql += " and strBisectionUnit like '%" + fundPlansSearch.getStrBisectionUnit() + "%'";
            }
        }

        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<CmFundPlans> fundPlanss = cmFundPlandsService.getFundPlans(sql);
        return list2Map(fundPlanss, dataTables);
    }


    /*@PostMapping("/queryInfo")
    public Map<String, Object> queryInfo(@ModelAttribute DataTables dataTables, @ModelAttribute CmFundPlansInfo fundPlansInfo) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<CmFundPlansInfo> fundPlanss = cmFundPlandsService.queryInfo(fundPlansInfo);
        return list2Map(fundPlanss, dataTables);
    }*/
    @PostMapping("/queryInfo")
    public Map<String, Object> queryInfo(@ModelAttribute DataTables dataTables, String search) {
        String sql = "";

        if (!StringUtils.isEmpty(search)) {
            FundPlansSearch fundPlansSearch = JSON.parseObject(search, FundPlansSearch.class);

            log.debug("CmFundPlansInfo -> {}", fundPlansSearch);

            if (!StringUtils.isEmpty(fundPlansSearch.getStrContractID())) {
                sql += " and a.strContractID like '%" + fundPlansSearch.getStrContractID() + "%'";
            }

            if (!StringUtils.isEmpty(fundPlansSearch.getStrBisectionUnit())) {
                sql += " and a.strBisectionUnit like '%" + fundPlansSearch.getStrBisectionUnit() + "%'";
            }
            if (!StringUtils.isEmpty(fundPlansSearch.getStrContractStartDate())) {
                sql += " and a.strContractStartDate >'" + fundPlansSearch.getStrContractStartDate()+"'";
            }
        }
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<CmFundPlansInfo> fundPlanss = cmFundPlandsService.queryInfo(sql);
        return list2Map(fundPlanss, dataTables);
    }

    @PostMapping("/getById")
    public CmFundPlans getById(String id) {
        CmFundPlans fundPlans = cmFundPlandsService.getById(id);
        return fundPlans;
    }

    @PostMapping("/addSid")
    public Map<String, Object> addSid(@RequestParam("strFundPlanID") String strFundPlanID) {
        Map<String, Object> map = new HashMap<>();
        String num = cmFundPlandsService.queryStrFundPlanID(strFundPlanID);
        map.put("id", num);
        return map;
    }

    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody Map<String, String> map) {
        //System.out.println(map.get("fundPlanInfo"));
        String fundPlanInfo = map.get("fundPlanInfo");
        String fundPlan = map.get("fundPlan");
        System.out.println(fundPlanInfo);
        System.out.println(fundPlan);


        CmFundPlans fundPlans = JSON.parseObject(fundPlanInfo, CmFundPlans.class);


        List<CmFundPlans> fundPlansList = JSON.parseObject(fundPlan, new TypeReference<List<CmFundPlans>>() {
        });

        int rows = 0;
        for (CmFundPlans fp : fundPlansList) {
            fp.setStrSetupDate(fundPlans.getStrSetupDate());
            fp.setStrSetupPerson(fundPlans.getStrSetupPerson());
            fp.setStrFundPlanID(fundPlans.getStrFundPlanID());
            fp.setStrFundPlanRemark(fundPlans.getStrFundPlanRemark());

            if (fp.getId() == null) {
                rows = cmFundPlandsService.save(fp);
            }
        }
        return saveResult(rows);
    }


    @PostMapping("/update/{id}")
    public Map<String, Object> update(@PathVariable String id, @RequestBody Map<String, String> map) {
        String fundPlanInfo = map.get("fundPlanInfo");
        String fundPlan = map.get("fundPlan");
        CmFundPlans fundPlans = JSON.parseObject(fundPlanInfo, CmFundPlans.class);
        List<CmFundPlans> fundPlansList = JSON.parseObject(fundPlan, new TypeReference<List<CmFundPlans>>() {
        });
        Integer a = Integer.parseInt(id);
        int rows = 0;
        for (CmFundPlans fp : fundPlansList) {
            fp.setStrSetupDate(fundPlans.getStrSetupDate());
            fp.setStrSetupPerson(fundPlans.getStrSetupPerson());
            fp.setStrFundPlanID(fundPlans.getStrFundPlanID());
            fp.setStrFundPlanRemark(fundPlans.getStrFundPlanRemark());
            fp.setId(a);
            rows = cmFundPlandsService.update(fp);

        }
        return updateResult(rows);
    }

    @PostMapping("/del")
    public Map<String, Object> del(String ids) {
        String[] result = ids.split(",");
        int rows = 0;
        for (int i = 0; i < result.length; i++) {
            rows = cmFundPlandsService.delete(result[i]);
        }
        return deleteResult(rows);
    }

}
