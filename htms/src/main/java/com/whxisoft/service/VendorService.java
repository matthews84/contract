package com.whxisoft.service;

import com.whxisoft.pojo.VendorBasic;


public interface VendorService extends BaseService<VendorBasic> {
    int checkcVenCode(String cVenCode);
}
