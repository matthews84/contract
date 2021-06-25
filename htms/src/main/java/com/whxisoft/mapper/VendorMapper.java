package com.whxisoft.mapper;

import com.whxisoft.pojo.VendorBasic;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorMapper extends BaseMapper<VendorBasic> {
    int checkcVenCode(String cVenCode);
}
