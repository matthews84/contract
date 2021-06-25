package com.whxisoft.mapper;

import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndCmBalance;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmBalanceMapper extends BaseMapper<CmBalance> {
    List<ContractAndItemAndCmBalance> getReferQuery(@Param("sql") String sql);

    List<CmBalance> getContractBalance(@Param("guid") String guid, @Param("rowIdList") List<String> rowIdList);

    List<CmContract> getstrBisectionUnit();

    ContractAndCmBalance getQueryByCmBalanceID(String cBalanceID);

    ContractAndItemAndCmBalance getCmBalanceById(@Param("BalancesGuid")String BalancesGuid);
}
