package com.whxisoft.service;

import com.whxisoft.pojo.*;
import com.whxisoft.pojo.proc.ContractOperProc;

import java.util.List;


public interface ContractOperProcService extends BaseService<ContractOperProc> {
    void operContract(ContractOperProc contractOper);

    CmContract queryContract(String guid);

    List<CmContractItem> queryContractItem(String guid);

    List<CmContractCaluse> queryContractCaluse(String guid);

    List<CmContractExt> queryContractExt(String guid);

    List<CmContractPay> queryContractPay(String guid);

    List<CmContractMemo> queryContractMemo(String guid);

    int updateContractStatus(String contractStatus, String guid);

    int checkContractId(String contractId);

    List<CmType> getContractKind(String contractType);

    List<CmType> getContractType(String contractKind);

    //查询历史合同
    CmContract queryOldContract(String guid);

    List<CmContractItem> queryOldContractItem(String guid);

    List<CmContractCaluse> queryOldContractCaluse(String guid);

    List<CmContractExt> queryOldContractExt(String guid);

    List<CmContractPay> queryOldContractPay(String guid);

    List<CmContractMemo> queryOldContractMemo(String guid);

    String getContractId();
}
