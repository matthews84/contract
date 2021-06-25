package com.whxisoft.service.impl;

import com.whxisoft.mapper.PayOrderMapper;
import com.whxisoft.pojo.BalancesItem;
import com.whxisoft.pojo.CmPayOrder;
import com.whxisoft.pojo.proc.ContractAndItemAndCmBalance;
import com.whxisoft.service.PayOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayOrderServiceImpl extends BaseServiceImpl<CmPayOrder> implements PayOrderService {
    @Autowired
    private PayOrderMapper payOrderMapper;
    @Override
    public List<CmPayOrder> queryFD(String id) {
        return payOrderMapper.queryFD(id);
    }

    @Override
    public String getPayOrderId() {
        return payOrderMapper.getPayOrderId();
    }


}
