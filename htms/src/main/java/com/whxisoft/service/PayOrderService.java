package com.whxisoft.service;

import com.whxisoft.pojo.BalancesItem;
import com.whxisoft.pojo.CmPayOrder;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;

import java.util.List;

public interface PayOrderService extends BaseService<CmPayOrder> {
    List<CmPayOrder> queryFD(String id);
    String getPayOrderId();
}
