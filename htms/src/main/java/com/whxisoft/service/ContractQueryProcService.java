package com.whxisoft.service;

import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndItem;
import com.whxisoft.pojo.proc.ContractQueryProc;

import java.util.List;


public interface ContractQueryProcService extends BaseService<CmContract> {
    List<CmContract> getContract(ContractQueryProc contractQuery);

    List<ContractAndItem> getContractAndItem(String sql);
}
