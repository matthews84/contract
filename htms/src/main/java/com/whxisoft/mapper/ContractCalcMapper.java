package com.whxisoft.mapper;

import com.whxisoft.pojo.CmBalance;
import com.whxisoft.pojo.CmBalances;
import com.whxisoft.pojo.excel.ContractItemExcel;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractCalcMapper extends BaseMapper<ContractItemExcel>{
    int update1(CmBalances cmBalances);
    int update2(CmBalance cmBalance);

    int checkcBalanceID(String cBalanceID);
}
