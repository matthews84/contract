package com.whxisoft.service.impl;

import com.whxisoft.mapper.CmTypeClassMapper;
import com.whxisoft.pojo.CmTypeClass;
import com.whxisoft.service.CmTypeClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CmTypeClassServiceImpl extends BaseServiceImpl<CmTypeClass> implements CmTypeClassService {
    @Autowired
    private CmTypeClassMapper cmTypeClassMapper;

    @Override
    public String getId(String id) {
        return cmTypeClassMapper.getId(id);
    }
}
