package com.whxisoft.mapper;

import com.whxisoft.pojo.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper extends BaseMapper<Customer>{
    int checkcCusCode(String cCusCode);
}
