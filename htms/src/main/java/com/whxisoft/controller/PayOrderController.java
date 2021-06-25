package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.pojo.BalancesItem;
import com.whxisoft.pojo.BalancesItemSearch;
import com.whxisoft.pojo.CmPayOrder;
import com.whxisoft.pojo.proc.ContractAndItem;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;
import com.whxisoft.pojo.proc.ContractAndItemSearch;
import com.whxisoft.service.CmBalanceService;
import com.whxisoft.service.ContractQueryProcService;
import com.whxisoft.service.PayOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/payOrder")
public class PayOrderController extends BaseContoller {
    private static final Logger log = LoggerFactory.getLogger(ContractQueryProcController.class);

    @Autowired
    private ContractQueryProcService contractQueryProcService;

    @Autowired
    private PayOrderService payOrderService;

    @Autowired
    private CmBalanceService cmBalanceService;

    /*
     * 添加
     * */
    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody Map<String, String> map) {
        //头基本信息
        String payOrderInfo = map.get("payOrderInfo");
        //表格基本信息
        String payOrder = map.get("payOrder");
        CmPayOrder cmPayOrder = JSON.parseObject(payOrderInfo, CmPayOrder.class);
        List<CmPayOrder> cmPayOrders = JSON.parseObject(payOrder, new TypeReference<List<CmPayOrder>>() {
        });
        int rows = 0;
        for (CmPayOrder cm : cmPayOrders) {
            cm.setStrSetupPerson(cmPayOrder.getStrSetupPerson());
            cm.setStrSetupDate(cmPayOrder.getStrSetupDate());
            cm.setDblExchange(cmPayOrder.getDblExchange());
            cm.setStrCurrency(cmPayOrder.getStrCurrency());
            cm.setStrPayOrderRemark(cmPayOrder.getStrPayOrderRemark());
            cm.setStrPayOrderID(cmPayOrder.getStrPayOrderID());
            rows = payOrderService.save(cm);
        }
        return saveResult(rows);
    }

    /*
     * 查询
     * */
    @PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, @ModelAttribute CmPayOrder CmPayOrder) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<CmPayOrder> byCond = payOrderService.getByCond(CmPayOrder);
        return list2Map(byCond, dataTables);
    }

    /*
     * 结算单参照查询
     * */
    @PostMapping("/referQuery")
    public Map<String, Object> referQuery(@ModelAttribute DataTables dataTables, String search) {
        String sql = "";

        if (!StringUtils.isEmpty(search)) {
            BalancesItemSearch balancesItemSearch = JSON.parseObject(search, BalancesItemSearch.class);

            log.debug("BalancesItemSearch -> {}", balancesItemSearch);

            if (!StringUtils.isEmpty(balancesItemSearch.getcContractID())) {
                sql += " and t1.cContractID like '%" + balancesItemSearch.getcContractID() + "%'";
            }

            if (!StringUtils.isEmpty(balancesItemSearch.getcBalanceID())) {
                sql += " and t1.cBalanceID like '%" + balancesItemSearch.getcBalanceID() + "%'";
            }
        }

        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<ContractAndItemAndCmBalance> items = cmBalanceService.getReferQuery(sql);
        return list2Map(items, dataTables);
    }

    /*
     * 删除
     * */
    @PostMapping("/del")
    public Map<String, Object> del(String id) {
        System.out.println(id);
        int delete = payOrderService.delete(id);
        return deleteResult(delete);
    }

    /*
     * 根据用户id查询
     * */
    @PostMapping("/queryFD")
    public String queryFD(@RequestParam("id") String id) {
        return JSON.toJSONString(payOrderService.queryFD(id));
    }

    /*
     * 修改页面
     * */
    @PostMapping("/update/{id}")
    public Map<String, Object> update(@PathVariable String id, @RequestBody Map<String, String> map) {
        //头基本信息
        String payOrderInfo = map.get("payOrderInfo");
        //表格基本信息
        String payOrder = map.get("payOrder");
        CmPayOrder cmPayOrder = JSON.parseObject(payOrderInfo, CmPayOrder.class);
        List<CmPayOrder> cmPayOrders = JSON.parseObject(payOrder, new TypeReference<List<CmPayOrder>>() {
        });
        Integer a = Integer.parseInt(id);
        int rows = 0;
        for (CmPayOrder cm : cmPayOrders) {
            cm.setStrSetupPerson(cmPayOrder.getStrSetupPerson());
            cm.setStrSetupDate(cmPayOrder.getStrSetupDate());
            cm.setDblExchange(cmPayOrder.getDblExchange());
            cm.setStrCurrency(cmPayOrder.getStrCurrency());
            cm.setStrPayOrderRemark(cmPayOrder.getStrPayOrderRemark());
            cm.setId(a);
            rows = payOrderService.update(cm);
        }
        return updateResult(rows);
    }

    @PostMapping("/getPayOrderId")
    public String getPayOrderId() {
        String payOrderId = payOrderService.getPayOrderId();
        String prefix = "SFD" + DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDateTime.now());
        String newpayOrderId = prefix + "001";
        if (!StringUtils.isEmpty(payOrderId)) {
            String no = String.valueOf((Integer.parseInt(payOrderId.substring((payOrderId.length() - 3)))) + 1);

            for (int i = no.length(); i < 3; i++) {
                no = "0" + no;
            }

            newpayOrderId = prefix + no;
        }

        return newpayOrderId;
    }
}
