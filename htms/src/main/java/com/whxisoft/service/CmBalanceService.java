package com.whxisoft.service;

import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmBalances;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;

import java.util.List;


public interface CmBalanceService extends BaseService<CmBalance> {
    void saveAll(CmBalance balance, List<CmBalances> balances);

    String getBalanceId();

    List<CmBalance> getContractBalance(String guid,String rowIds);
    List<ContractAndItemAndCmBalance> getReferQuery(String sql);
}
