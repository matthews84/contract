package com.whxisoft.mapper;

import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;
import com.whxisoft.pojo.CmBalances;
import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndCmBalance;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmBalancesMapper extends BaseMapper<CmBalances> {
    CmContract getContract(@Param("guid") String guid);

    List<CmBalances> getContractItem(@Param("guid") String guid, @Param("rowIdList") List<String> rowIdList);
    List<ContractAndCmBalance> getContractAndCmBalance(@Param("guid") String guid, @Param("GUIdList") List<String> GUIdList);

    List<String> getContractItemId(@Param("guid") String guid);
    List<ContractAndItemAndCmBalance> getContractAndItemAndCmBalance(@Param("sql") String sql);
    String getBalanceId();
}
