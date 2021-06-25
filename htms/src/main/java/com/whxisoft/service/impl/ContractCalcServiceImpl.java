package com.whxisoft.service.impl;

import com.whxisoft.mapper.ContractCalcMapper;
import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmBalances;
import com.whxisoft.service.ContractCalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContractCalcServiceImpl extends BaseServiceImpl<CmBalance> implements ContractCalcService {
    @Autowired
    private ContractCalcMapper ContractCalcMapper;

    @Override
    public int update2(CmBalance cmBalance) {
        return ContractCalcMapper.update2(cmBalance);
    }

    @Override
    public int update1(CmBalances cmBalances) {
        return ContractCalcMapper.update1(cmBalances);
    }

    @Override
    public int checkcBalanceID(String cBalanceID) {
        return ContractCalcMapper.checkcBalanceID(cBalanceID);
    }
}
