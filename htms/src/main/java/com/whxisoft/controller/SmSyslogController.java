package com.whxisoft.controller;

import com.github.pagehelper.PageHelper;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.pojo.SmSyslog;

import com.whxisoft.service.SmSyslogService;

import com.whxisoft.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/services/idm_sm_syslog")
public class SmSyslogController extends BaseContoller {
    @Autowired
    private SmSyslogService smSyslogService;


    @PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, @ModelAttribute SmSyslog smSyslog) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<SmSyslog> smSyslogs = smSyslogService.getByCond(smSyslog);
        return list2Map(smSyslogs, dataTables);
    }

    @PostMapping("/del")
    public Map<String, Object> del(String ids) {
        int  rows = 0;
        if(ids == null){
            rows = smSyslogService.deleteAll();
        }else {
            String[] result = ids.split(",");
            for (int i = 0; i < result.length; i++) {
                rows = smSyslogService.delete(result[i]);
            }
        }

        return deleteResult(rows);
    }


}
