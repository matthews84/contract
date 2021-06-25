package com.whxisoft.service;

import com.whxisoft.pojo.CmFundPlans;
import com.whxisoft.pojo.CmFundPlansInfo;

import java.util.List;

public interface CmFundPlandsService extends BaseService<CmFundPlans> {

    List<CmFundPlans> queryFundPlands(String strFundPlanID);

    String queryStrFundPlanID(String strFundPlanID);

    List<CmFundPlans> queryFD(String id);

    List<CmFundPlans> getFundPlans(String sql);

    List<CmFundPlansInfo> queryInfo(String sql);
}
