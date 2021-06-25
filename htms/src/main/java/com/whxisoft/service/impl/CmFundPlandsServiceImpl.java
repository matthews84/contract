package com.whxisoft.service.impl;

import com.whxisoft.mapper.CmFundPlandsMapper;
import com.whxisoft.pojo.CmFundPlans;
import com.whxisoft.pojo.CmFundPlansInfo;
import com.whxisoft.service.CmFundPlandsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CmFundPlandsServiceImpl extends BaseServiceImpl<CmFundPlans> implements CmFundPlandsService {
    @Autowired
    private CmFundPlandsMapper cmFundPlands;

    @Override
    public List<CmFundPlans> queryFundPlands(String strFundPlanID) {
        return cmFundPlands.queryFundPlands(strFundPlanID);
    }

    @Override
    public String queryStrFundPlanID(String strFundPlanID) {
        return cmFundPlands.queryStrFundPlanID(strFundPlanID);
    }

    @Override
    public List<CmFundPlans> queryFD(String id) {
        return cmFundPlands.queryFD(id);
    }

    @Override
    public List<CmFundPlansInfo> queryInfo(String sql) {
        return cmFundPlands.queryInfo(sql);
    }

    @Override
    public  List<CmFundPlans> getFundPlans(String sql){
        return cmFundPlands.getFundPlans(sql);
    };
}
