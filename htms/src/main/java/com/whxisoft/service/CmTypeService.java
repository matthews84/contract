package com.whxisoft.service;

import com.whxisoft.pojo.CmType;

import java.util.List;


public interface CmTypeService extends BaseService<CmType> {
    List<CmType> getGroup(CmType cmType);

    List<CmType> getID(String id);

    List<CmType> getByCond1(CmType cmType);
}
