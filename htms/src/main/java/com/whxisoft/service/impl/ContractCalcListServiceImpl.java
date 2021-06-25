package com.whxisoft.service.impl;

import com.whxisoft.mapper.CmBalanceMapper;
import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndCmBalance;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;
import com.whxisoft.service.ContractCalcListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class ContractCalcListServiceImpl extends BaseServiceImpl<CmBalance> implements ContractCalcListService {
    @Autowired
    private CmBalanceMapper cmBalanceMapper;

    @Override
    public int getBid(String id) {
//        return cmBalanceMapper.getBid(id);
        return 0;
    }
    @Override
    public ContractAndItemAndCmBalance getCmBalanceById(String BalancesGuid) {
        return cmBalanceMapper.getCmBalanceById(BalancesGuid);
    }

    @Override
    public List<ContractAndItemAndCmBalance> getReferQuery(String sql) {
        return cmBalanceMapper.getReferQuery(sql);
    }

    @Override
    public List<CmBalance> getContractBalance(String guid,String rowIds) {
        List<String> rowIdList = new ArrayList<>();
        if(!StringUtils.isEmpty(rowIds)) {
            rowIdList = new ArrayList<>(Arrays.asList(rowIds.split(",")));
        }

        return cmBalanceMapper.getContractBalance(guid, rowIdList);
    }

    @Override
    public List<CmContract> getstrBisectionUnit() {
        return cmBalanceMapper.getstrBisectionUnit();
    }

    @Override
    public ContractAndCmBalance getQueryByCmBalanceID(String cBalanceID) {
        return cmBalanceMapper.getQueryByCmBalanceID(cBalanceID);
    }
}
