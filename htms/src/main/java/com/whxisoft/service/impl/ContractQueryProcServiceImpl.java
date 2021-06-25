package com.whxisoft.service.impl;

import com.whxisoft.mapper.ContractQueryProcMapper;
import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndItem;
import com.whxisoft.pojo.proc.ContractQueryProc;
import com.whxisoft.service.ContractQueryProcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ContractQueryProcServiceImpl extends BaseServiceImpl<CmContract> implements ContractQueryProcService {
    @Autowired
    private ContractQueryProcMapper contractQueryProcMapper;

    @Override
    public List<CmContract> getContract(ContractQueryProc contractQuery) {
        return contractQueryProcMapper.getContract(contractQuery);
    }

    @Override
    public List<ContractAndItem> getContractAndItem(String sql) {
        return contractQueryProcMapper.getContractAndItem(sql);
    }
}
