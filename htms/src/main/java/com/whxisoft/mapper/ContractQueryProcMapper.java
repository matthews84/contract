package com.whxisoft.mapper;

import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndItem;
import com.whxisoft.pojo.proc.ContractQueryProc;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractQueryProcMapper extends BaseMapper<CmContract> {

    List<CmContract> getContract(ContractQueryProc contractQuery);

    List<ContractAndItem> getContractAndItem(@Param("sql") String sql);
}
