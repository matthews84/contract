package com.whxisoft.service.impl;

import com.whxisoft.datasource.TargetDataSource;
import com.whxisoft.mapper.ContractOperProcMapper;
import com.whxisoft.pojo.*;
import com.whxisoft.pojo.proc.ContractOperProc;
import com.whxisoft.service.ContractOperProcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class ContractOperProcServiceImpl extends BaseServiceImpl<ContractOperProc> implements ContractOperProcService {
    @Autowired
    private ContractOperProcMapper contractOperProcMapper;

    @Override
    public void operContract(ContractOperProc contractOper) {
        contractOperProcMapper.operContract(contractOper);
    }

    @Override
    public CmContract queryContract(String guid) {
        return contractOperProcMapper.queryContract(guid);
    }

    @Override
    public List<CmContractItem> queryContractItem(String guid) {
        return contractOperProcMapper.queryContractItem(guid);
    }

    @Override
    public List<CmContractCaluse> queryContractCaluse(String guid) {
        return contractOperProcMapper.queryContractCaluse(guid);
    }

    @Override
    public List<CmContractExt> queryContractExt(String guid) {
        return contractOperProcMapper.queryContractExt(guid);
    }

    @Override
    public List<CmContractPay> queryContractPay(String guid) {
        return contractOperProcMapper.queryContractPay(guid);
    }

    @Override
    public List<CmContractMemo> queryContractMemo(String guid) {
        return contractOperProcMapper.queryContractMemo(guid);
    }

    @Override
    public int updateContractStatus(String contractStatus, String guid) {
        return contractOperProcMapper.updateContractStatus(contractStatus, guid);
    }

    @Override
    public int checkContractId(String contractId) {
        return contractOperProcMapper.checkContractId(contractId);
    }

    @Override
    public List<CmType> getContractKind(String contractType) {
        return contractOperProcMapper.getContractKind(contractType);
    }

    @Override
    public List<CmType> getContractType(String contractKind) {
        return contractOperProcMapper.getContractType(contractKind);
    }

    //查询历史合同
    @TargetDataSource(name = "slave")
    @Override
    public CmContract queryOldContract(String guid) {
        return contractOperProcMapper.queryOldContract(guid);
    }

    @TargetDataSource(name = "slave")
    @Override
    public List<CmContractItem> queryOldContractItem(String guid) {
        return contractOperProcMapper.queryOldContractItem(guid);
    }

    @TargetDataSource(name = "slave")
    @Override
    public List<CmContractCaluse> queryOldContractCaluse(String guid) {
        return contractOperProcMapper.queryOldContractCaluse(guid);
    }

    @TargetDataSource(name = "slave")
    @Override
    public List<CmContractExt> queryOldContractExt(String guid) {
        return contractOperProcMapper.queryOldContractExt(guid);
    }

    @TargetDataSource(name = "slave")
    @Override
    public List<CmContractPay> queryOldContractPay(String guid) {
        return contractOperProcMapper.queryOldContractPay(guid);
    }

    @TargetDataSource(name = "slave")
    @Override
    public List<CmContractMemo> queryOldContractMemo(String guid) {
        return contractOperProcMapper.queryOldContractMemo(guid);
    }


    @Override
    public String getContractId() {
        return contractOperProcMapper.getContractId();
    }
}
