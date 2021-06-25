package com.whxisoft.mapper;

import com.whxisoft.pojo.BalancesItem;
import com.whxisoft.pojo.CmPayOrder;
import com.whxisoft.pojo.proc.ContractAndItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PayOrderMapper extends BaseMapper<CmPayOrder> {
    List<CmPayOrder> queryFD(String id);
    String getPayOrderId();
    List<BalancesItem> getBalancesItem(@Param("sql") String sql);

}
