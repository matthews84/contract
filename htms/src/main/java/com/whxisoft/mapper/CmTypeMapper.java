package com.whxisoft.mapper;

import com.whxisoft.pojo.CmType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmTypeMapper extends BaseMapper<CmType> {
    List<CmType> getGroup();

    List<CmType> getID(String id);

    List<CmType> getByCond1(CmType cmType);
}
