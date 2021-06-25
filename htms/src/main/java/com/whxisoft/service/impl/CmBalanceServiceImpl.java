package com.whxisoft.service.impl;

import com.whxisoft.mapper.CmBalanceMapper;
import com.whxisoft.mapper.CmBalancesMapper;
import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmBalances;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;
import com.whxisoft.service.CmBalanceService;
import com.whxisoft.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class CmBalanceServiceImpl extends BaseServiceImpl<CmBalance> implements CmBalanceService {
    @Autowired
    private CmBalanceMapper balanceMapper;

    @Autowired
    private CmBalancesMapper balancesMapper;

    @Override
    public void saveAll(CmBalance balance, List<CmBalances> balances) {
        String balanceGuid = StringUtil.getGUID();

        balance.setGUID(balanceGuid);//待定

        balance.setBalanceGuid(balanceGuid);
        balanceMapper.save(balance);

        for (CmBalances cmBalances : balances) {
            cmBalances.setcBalanceID(balance.getcBalanceID());
            cmBalances.setcCode(balanceGuid);//待定
            cmBalances.setDecRate("0");//待定

            cmBalances.setBalanceGuid(balanceGuid);
            cmBalances.setBalancesGuid(StringUtil.getGUID());
            cmBalances.setGuid(StringUtil.getGUID());

            balancesMapper.save(cmBalances);
        }
    }

    @Override
    public String getBalanceId() {
        return balancesMapper.getBalanceId();
    }

    @Override
    public List<CmBalance> getContractBalance(String guid,String rowIds) {
        List<String> rowIdList = new ArrayList<>();
        if(!StringUtils.isEmpty(rowIds)) {
            rowIdList = new ArrayList<>(Arrays.asList(rowIds.split(",")));
        }

        return balanceMapper.getContractBalance(guid, rowIdList);
    }


    @Override
    public List<ContractAndItemAndCmBalance> getReferQuery(String sql) {
        return balanceMapper.getReferQuery(sql);
    }


}
