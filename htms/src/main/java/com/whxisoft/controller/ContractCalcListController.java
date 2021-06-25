package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.PageHelper;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.pojo.*;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;
import com.whxisoft.pojo.proc.ContractAndItem;
import com.whxisoft.pojo.proc.ContractAndItemSearch;
import com.whxisoft.pojo.proc.ContractCalcForm;
import com.whxisoft.service.CmBalancesService;
import com.whxisoft.service.ContractCalcListService;
import com.whxisoft.service.ContractCalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
* 结算单列表控制层
* */
@RestController
@RequestMapping("/services/contractCalcList")
public class ContractCalcListController extends BaseContoller {
    @Autowired
    private ContractCalcListService contractCalcListService;
    @Autowired
    private ContractCalcService contractCalcService;
    @Autowired
    private CmBalancesService cmBalancesService;
    /*
     * 结算单查询
     * */
    /*@PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, @ModelAttribute CmBalance cmBalance) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<CmBalance> byCond = contractCalcListService.getByCond(cmBalance);
        return list2Map(byCond, dataTables);
    }*/
   /*结算单列表List*/
    @PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, String search) {
        String sql = "";

        if (!StringUtils.isEmpty(search)) {
            /*ContracctAndItemAndCmBalance contracctAndItemAndCmBalance = JSON.parseObject(search, ContracctAndItemAndCmBalance.class);

            if (!StringUtils.isEmpty(contracctAndItemAndCmBalance.getContractAndItem().getStrContractID())) {
                sql += " and t1.strContractID like '%" + contracctAndItemAndCmBalance.getContractAndItem().getStrContractID() + "%'";
            }

            if (!StringUtils.isEmpty(contracctAndItemAndCmBalance.getcBalanceID())) {
                sql += " and t2.cBalanceID like '%" + contracctAndItemAndCmBalance.getcBalanceID() + "%'";
            }*/
        }
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<ContractAndItemAndCmBalance> contractAnditemAndcmBalance = cmBalancesService.getContractAndItemAndCmBalance(sql);
        return list2Map(contractAnditemAndcmBalance, dataTables);
    }
    /*
    * 结算单参照查询
    * */
    @PostMapping("/referQuery")
    public Map<String, Object> referQuery(@ModelAttribute DataTables dataTables, String search) {
        String sql = "";

        if (!StringUtils.isEmpty(search)) {
            ContractAndItemAndCmBalance contractAndItemAndCmBalance = JSON.parseObject(search, ContractAndItemAndCmBalance.class);

            if (!StringUtils.isEmpty(contractAndItemAndCmBalance.getContractAndItem().getStrContractID())) {
                sql += " and t1.strContractID like '%" + contractAndItemAndCmBalance.getContractAndItem().getStrContractID() + "%'";
            }

            if (!StringUtils.isEmpty(contractAndItemAndCmBalance.getcBalanceID())) {
                sql += " and t2.cBalanceID like '%" + contractAndItemAndCmBalance.getcBalanceID() + "%'";
            }
        }

        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<ContractAndItemAndCmBalance> items = contractCalcListService.getReferQuery(sql);
        return list2Map(items, dataTables);
    }

    /*查询对方单位*/
    @PostMapping("/queryStrBisectionUnit")
    public JSONArray queryStrBisectionUnit() {
        List<CmContract> cmContractList = contractCalcListService.getstrBisectionUnit();

        JSONArray array = new JSONArray();

        JSONObject object;
        for (CmContract cmContract : cmContractList) {
            object = new JSONObject();
            object.put("strBisectionUnit", cmContract.getStrBisectionUnit());
            array.add(object);
        }

        return array;
    }

    /*
    * 根据结算id查询合同结算单，回显到主页面
    * */
    @PostMapping("/queryContractBalance")
    public String queryContractBalance(@RequestParam("cBalanceID") String cBalanceID) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractCalcListService.getQueryByCmBalanceID(cBalanceID), filter);
    }

    /*
     * 删除
     * */
    @PostMapping("/del")
    public Map<String, Object> del(String id) {
        /*System.out.println(id);
        int getid = contractCalcListService.getBid(id);
        System.out.println(getid);
        if(getid==1){
            contractCalcService.delete(id);
        }*/
        int delete = contractCalcListService.delete(id);
        return deleteResult(delete);
    }
    /*
    * 给页面赋值(根据cBalanceID去查询)
    * */
    @PostMapping("/cBalanceID")
    public ContractAndItemAndCmBalance BalancesGuid (@ModelAttribute DataTables dataTables,@RequestParam("BalancesGuid") String BalancesGuid){
        //System.out.println(BalancesGuid);
        ContractAndItemAndCmBalance cmbalance = contractCalcListService.getCmBalanceById(BalancesGuid);
        return cmbalance;
    }
    /*
    * 结算单修改
    * */
    @PostMapping("/update/{id}")
    public Map<String,Object> update(@PathVariable String id,@RequestBody ContractCalcForm contractCalcForm){
        String balance = contractCalcForm.getBalance();
        System.out.println(balance);
        String balances = contractCalcForm.getBalances();
        System.out.println(balances);
        //修改主表格
        CmBalance cmBalance = JSON.parseObject(balance, CmBalance.class);
        contractCalcService.update2(cmBalance);
        //修改子表表格
        List<CmBalances> CmBalances = JSON.parseObject(balances, new TypeReference<List<CmBalances>>() {
        });
        int rows = 0;
        for(CmBalances c: CmBalances){
            c.setBalancesGuid(id);
            rows= contractCalcService.update1(c);
        }
        return updateResult(rows);
    }
}
