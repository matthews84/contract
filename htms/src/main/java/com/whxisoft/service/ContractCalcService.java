package com.whxisoft.service;

import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmBalances;

public interface ContractCalcService extends BaseService<CmBalance> {
   int update2(CmBalance cmBalance);

    int update1(CmBalances cmBalances);
    //结算单编码校验
   int checkcBalanceID(String cBalanceID);
}
