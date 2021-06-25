package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.whxisoft.constant.SystemConstants;
import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmBalances;
import com.whxisoft.pojo.proc.ContractCalcForm;
import com.whxisoft.service.ContractCalcService;
import com.whxisoft.service.ContractCalcsService;
import com.whxisoft.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/*
 * contractCalc控制层
 * */
@RestController
@RequestMapping("/services/contractCalc/")
public class ContractCalcController extends BaseContoller {
    @Autowired
    private ContractCalcService contractCalcService;
    @Autowired
    private ContractCalcsService contractCalcsService;

    /*
     * 结算单保存
     * */
    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody ContractCalcForm contractCalcForm) {
        String balance = contractCalcForm.getBalance();
        String balances = contractCalcForm.getBalances();
        System.out.println(balances);
        System.out.println(balances);
        CmBalance cmBalance = JSON.parseObject(balance, CmBalance.class);
        String us = cmBalance.getcBalanceID();
        //主表保存
        int rows = contractCalcService.save(cmBalance);
        //获取类型子表类型
        List<CmBalances> cmBalances = JSON.parseObject(balances, new TypeReference<List<CmBalances>>() {
        });
        //设置不能为空的字段
        for (CmBalances cm : cmBalances) {
            cm.setcBalanceID(us);
            cm.setBalanceGuid(StringUtil.getUUID());
            contractCalcsService.save(cm);
        }
        return saveResult(1);
    }

    /*
     * 结算单编码校验
     * */
    @PostMapping("/checkcBalanceID")
    public JSONObject checkContractId(String cBalanceID) {
        int count = contractCalcService.checkcBalanceID(cBalanceID);
        JSONObject object = new JSONObject();
        if (count > 0) {
            object.put("code", SystemConstants.FAIL);
            object.put("msg", "结算单编号重复！");
            object.put("count", count);
        } else {
            object.put("code", SystemConstants.SUCCESS);
        }
        return object;
    }

}
