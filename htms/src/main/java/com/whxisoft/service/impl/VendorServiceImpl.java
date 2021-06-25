package com.whxisoft.service.impl;

import com.whxisoft.mapper.VendorMapper;
import com.whxisoft.pojo.VendorBasic;
import com.whxisoft.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class VendorServiceImpl extends BaseServiceImpl<VendorBasic> implements VendorService {
    @Autowired
    private VendorMapper VendorMapper;
    @Override
    public int checkcVenCode(String cVenCode) {
        return VendorMapper.checkcVenCode(cVenCode);
    }
}
