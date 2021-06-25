package com.whxisoft.service.impl;

import com.whxisoft.mapper.CmBalancesMapper;
import com.whxisoft.pojo.BalancesItem;
import com.whxisoft.pojo.CmBalances;
import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndCmBalance;
import com.whxisoft.pojo.proc.ContractAndItem;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;
import com.whxisoft.service.CmBalancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class CmBalancesServiceImpl extends BaseServiceImpl<CmBalances> implements CmBalancesService {
    @Autowired
    private CmBalancesMapper balancesMapper;

    @Override
    public CmContract getContract(String guid) {
        return balancesMapper.getContract(guid);
    }

    @Override
    public List<CmBalances> getContractItem(String guid, String rowIds) {
        List<String> rowIdList = new ArrayList<>();
        if(!StringUtils.isEmpty(rowIds)) {
            rowIdList = new ArrayList<>(Arrays.asList(rowIds.split(",")));
        }

        return balancesMapper.getContractItem(guid, rowIdList);
    }

    @Override
    public List<ContractAndCmBalance> getContractAndCmBalance(String guid, String GUIds) {
        List<String> GUIdList = new ArrayList<>();
        if(!StringUtils.isEmpty(GUIds)) {
            GUIdList = new ArrayList<>(Arrays.asList(GUIds.split(",")));
        }

        return balancesMapper.getContractAndCmBalance(guid,GUIdList);
    }

    @Override
    public List<String> getContractItemId(String guid) {
        return balancesMapper.getContractItemId(guid);
    }


    @Override
    public List<ContractAndItemAndCmBalance> getContractAndItemAndCmBalance(String sql) {
        return balancesMapper.getContractAndItemAndCmBalance(sql);
    }
}
