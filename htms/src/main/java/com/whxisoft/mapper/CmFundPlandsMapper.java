package com.whxisoft.mapper;

import com.whxisoft.pojo.CmFundPlans;
import com.whxisoft.pojo.CmFundPlansInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmFundPlandsMapper extends BaseMapper<CmFundPlans>{
    List<CmFundPlans> queryFundPlands(String search);

    String queryStrFundPlanID(String strFundPlanID);

    List<CmFundPlans> queryFD(String id);

    List<CmFundPlans> getFundPlans(@Param("sql")String sql);

    List<CmFundPlansInfo> queryInfo(@Param("sql")String sql);
}
