package com.whxisoft.service;

import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndCmBalance;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;

import java.util.List;

public interface ContractCalcListService extends BaseService<CmBalance> {
    int getBid(String id);

    List<ContractAndItemAndCmBalance> getReferQuery(String sql);

    List<CmBalance> getContractBalance(String guid,String rowIds);

    List<CmContract> getstrBisectionUnit();

    ContractAndCmBalance getQueryByCmBalanceID(String cBalanceID);
    ContractAndItemAndCmBalance getCmBalanceById(String BalancesGuid);
}
