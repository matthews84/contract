package com.whxisoft.service;

import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;
import com.whxisoft.pojo.CmBalances;
import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndCmBalance;

import java.util.List;

public interface CmBalancesService extends BaseService<CmBalances> {
    CmContract getContract(String guid);

    List<CmBalances> getContractItem(String guid, String rowIds);
    List<ContractAndCmBalance> getContractAndCmBalance(String guid, String GUIds);

    List<String> getContractItemId(String guid);
    List<ContractAndItemAndCmBalance> getContractAndItemAndCmBalance(String sql);
}
