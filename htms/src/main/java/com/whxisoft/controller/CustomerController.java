package com.whxisoft.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.whxisoft.constant.SystemConstants;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.pojo.Customer;
import com.whxisoft.pojo.proc.CustomerForm;
import com.whxisoft.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/*
 * 客户管理控制层
 * */
@RestController
@RequestMapping("/services/customer")
public class CustomerController extends BaseContoller {
    @Autowired
    private CustomerService customerService;

    /*
     * 保存
     * */
    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody CustomerForm customerForm) {
        String customerBasic1 = customerForm.getCustomerBasic();
        Customer customer = JSON.parseObject(customerBasic1, Customer.class);
        int rows = customerService.save(customer);
        return saveResult(rows);
    }

    /*
     * 客户编码校验
     * */
    @PostMapping("/checkcCusCode")
    public JSONObject checkcCusCode(String cCusCode) {
        int count = customerService.checkcCusCode(cCusCode);
        JSONObject object = new JSONObject();
        if (count > 0) {
            object.put("code", SystemConstants.FAIL);
            object.put("msg", "客户编码重复！");
            object.put("count", count);
        } else {
            object.put("code", SystemConstants.SUCCESS);
        }
        return object;
    }

    /*
     * 查询
     * */
    @PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, @ModelAttribute Customer Customer) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<Customer> customers = customerService.getByCond(Customer);
        return list2Map(customers, dataTables);
    }

    /*
     * 删除
     * */
    @PostMapping("/del")
    public Map<String, Object> del(String cCusCode) {
        int delete = customerService.delete(cCusCode);
        return deleteResult(delete);
    }

    /*
     * 根据客户编码查询客户信息
     * */
    @PostMapping("/queryCCusCode")
    public Map<String, Object> queryCVenCode(@ModelAttribute DataTables dataTables, String cCusCode) {
        Customer customer = customerService.getById(cCusCode);
        List<Customer> customerBasics = new ArrayList<>();
        customerBasics.add(customer);
        return list2Map(customerBasics, dataTables);
    }

    /*
     * 修改页面
     * */
    @PostMapping("/update")
    public Map<String, Object> update(@RequestBody CustomerForm CustomerForm) {
        String customerBasic = CustomerForm.getCustomerBasic();
        Customer customer = JSON.parseObject(customerBasic, Customer.class);
        int rows = customerService.update(customer);
        return updateResult(rows);
    }
}
