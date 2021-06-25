package com.whxisoft.mapper;

import com.whxisoft.pojo.*;
import com.whxisoft.pojo.proc.ContractOperProc;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractOperProcMapper extends BaseMapper<ContractOperProc> {

    void operContract(ContractOperProc contractOper);

    CmContract queryContract(String guid);

    List<CmContractItem> queryContractItem(String guid);

    List<CmContractCaluse> queryContractCaluse(String guid);

    List<CmContractExt> queryContractExt(String guid);

    List<CmContractPay> queryContractPay(String guid);

    List<CmContractMemo> queryContractMemo(String guid);

    int updateContractStatus(@Param("contractStatus") String contractStatus, @Param("guid") String guid);

    int checkContractId(String contractId);

    List<CmType> getContractKind(@Param("contractType") String contractType);

    List<CmType> getContractType(@Param("contractKind") String contractKind);

    //查询历史合同
    CmContract queryOldContract(@Param("guid") String guid);

    List<CmContractItem> queryOldContractItem(@Param("guid") String guid);

    List<CmContractCaluse> queryOldContractCaluse(@Param("guid") String guid);

    List<CmContractExt> queryOldContractExt(@Param("guid") String guid);

    List<CmContractPay> queryOldContractPay(@Param("guid") String guid);

    List<CmContractMemo> queryOldContractMemo(@Param("guid") String guid);

    String getContractId();
}
