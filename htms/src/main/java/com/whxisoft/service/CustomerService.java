package com.whxisoft.service;

import com.whxisoft.pojo.Customer;

public interface CustomerService extends BaseService<Customer>{

    int checkcCusCode(String cCusCode);
}
