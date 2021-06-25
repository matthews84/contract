package com.whxisoft.service.impl;

import com.whxisoft.mapper.CustomerMapper;
import com.whxisoft.pojo.Customer;
import com.whxisoft.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends  BaseServiceImpl<Customer> implements CustomerService {
    @Autowired
    private CustomerMapper CustomerMapper;

    @Override
    public int checkcCusCode(String cCusCode) {
        return CustomerMapper.checkcCusCode(cCusCode);
    }
}
