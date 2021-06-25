package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.whxisoft.service.CmBalancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/cm_balances")
public class CmBalancesController extends BaseContoller {
    @Autowired
    private CmBalancesService balancesService;

    @PostMapping("/queryContract")
    public String queryContract(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(balancesService.getContract(guid), filter);
    }

    @PostMapping("/queryContractItem")
    public String queryContractItem(@RequestParam("guid") String guid, @RequestParam("rowIds") String rowIds) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(balancesService.getContractItem(guid, rowIds), filter);
    }

    @PostMapping("/queryContractAndCmBalance")
    public String queryContractAndCmBalance(@RequestParam("guid") String guid, @RequestParam("rowIds") String GUIDs) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(balancesService.getContractAndCmBalance(guid, GUIDs), filter);
    }

    @PostMapping("/queryContractItemId")
    public String queryContractItemId(@RequestParam("guid") String guid) {
        return JSON.toJSONString(balancesService.getContractItemId(guid));
    }
}
