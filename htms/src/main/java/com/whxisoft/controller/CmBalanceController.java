package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.whxisoft.log.Log;
import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmBalances;
import com.whxisoft.pojo.proc.CmBalanceForm;
import com.whxisoft.service.CmBalanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/cm_balance")
public class CmBalanceController extends BaseContoller {
    private static final Logger log = LoggerFactory.getLogger(CmBalanceController.class);

    @Autowired
    private CmBalanceService balanceService;

    @Log(module = "添加合同结算单")
    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody CmBalanceForm balanceForm) {
        String balance = balanceForm.getBalance();
        String balances = balanceForm.getBalances();

        log.debug("\n\n{}\n{}\n", balance, balances);

        CmBalance cmBalance = JSON.parseObject(balance, CmBalance.class);

        List<CmBalances> cmBalances = JSON.parseObject(balances, new TypeReference<List<CmBalances>>() {
        });

        int result = 0;
        try {
            balanceService.saveAll(cmBalance, cmBalances);
            result = 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return saveResult(result);
    }

    @PostMapping("/getBalanceId")
    public String getBalanceId() {
        String balanceId = balanceService.getBalanceId();

        String prefix = "JSD" + DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDateTime.now());
        String newBalanceId = prefix + "001";
        if (!StringUtils.isEmpty(balanceId)) {
            String no = String.valueOf((Integer.parseInt(balanceId.substring((balanceId.length() - 3)))) + 1);

            for (int i = no.length(); i < 3; i++) {
                no = "0" + no;
            }

            newBalanceId = prefix + no;
        }

        return newBalanceId;
    }
}