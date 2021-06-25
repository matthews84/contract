package com.whxisoft.service.impl;

import com.whxisoft.mapper.CmTypeMapper;
import com.whxisoft.pojo.CmType;
import com.whxisoft.service.CmTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CmTypeServiceImpl extends BaseServiceImpl<CmType> implements CmTypeService {
    @Autowired
    private CmTypeMapper cmTypeMapper;

    @Override
    public List<CmType> getGroup(CmType cmType) {
        return cmTypeMapper.getGroup();
    }

    @Override
    public List<CmType> getID(String id) {
        return cmTypeMapper.getID(id);
    }

    @Override
    public List<CmType> getByCond1(CmType cmType) {
        return cmTypeMapper.getByCond1(cmType);
    }
}
