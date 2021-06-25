package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.whxisoft.constant.SystemConstants;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.pojo.VendorBasic;
import com.whxisoft.pojo.proc.VendorForm;
import com.whxisoft.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/vendor")
public class VendorController extends BaseContoller {
    @Autowired
    private VendorService vendorService;

    /*
     * 判断供应商编码是否存在校验
     *
     * */
    @PostMapping("/checkcVenCode")
    public JSONObject checkcVenCode(String cVenCode) {
        final int count = vendorService.checkcVenCode(cVenCode);
        JSONObject object = new JSONObject();
        if (count > 0) {
            object.put("code", SystemConstants.FAIL);
            object.put("msg", "供应商编码重复！");
            object.put("count", count);
        } else {
            object.put("code", SystemConstants.SUCCESS);
        }
        return object;
    }

    /*
     *添加（供应商档案保存）
     */
    @PostMapping("/add")
    public Map<String, Object> add(@RequestBody VendorForm vendorForm) {
        String vendorBasic1 = vendorForm.getVendorBasic();
        VendorBasic vendorBasic = JSON.parseObject(vendorBasic1, VendorBasic.class);
        //设置主键
            /*vendorBasic.setcVenCode(StringUtil.getUUID());
            //设置非空字段
            vendorBasic.setcVenCode("非空");
            vendorBasic.setcVenAbbName("非空");*/
        vendorBasic.setbVenTax("0");
        vendorBasic.setbLicenceDate("0");
        vendorBasic.setbBusinessDate("0");
        vendorBasic.setbProxyDate("0");
        vendorBasic.setbPassGMP("1");
        vendorBasic.setbVenCargo("1");
        vendorBasic.setbProxyForeign("1");
        vendorBasic.setbVenService("1");
        vendorBasic.setiVenGSPType("1");
        vendorBasic.setbVenOverseas("0");
        vendorBasic.setbVenAccPeriodMng("0");
        vendorBasic.setbVenHomeBranch("0");
        vendorBasic.setdVenCreateDatetime(new Date());
        int row = vendorService.save(vendorBasic);
        return saveResult(row);
    }

    /*
     * 查询
     * */
    @PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, @ModelAttribute VendorBasic vendorBasic) {
        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<VendorBasic> byCond = vendorService.getByCond(vendorBasic);
        return list2Map(byCond, dataTables);
    }

    /*
     * 删除
     * */
    @PostMapping("/del")
    public Map<String, Object> del(String cVenCode) {
        int delete = vendorService.delete(cVenCode);
        return deleteResult(delete);
    }

    /*
     * 根据供应商编码查询
     * */
    @PostMapping("/queryCVenCode")
    public Map<String, Object> queryCVenCode(@ModelAttribute DataTables dataTables, String cVenCode) {
        VendorBasic vendor = vendorService.getById(cVenCode);
        List<VendorBasic> vendorBasics = new ArrayList<>();
        vendorBasics.add(vendor);
        return list2Map(vendorBasics, dataTables);
    }

    /*
     * 修改
     * */
    @PostMapping("/update")
    public Map<String, Object> update(@RequestBody VendorForm vendorForm) {
        //获取第一个页面数据
        String vendorBasic1 = vendorForm.getVendorBasic();
        VendorBasic vendorBasic = JSON.parseObject(vendorBasic1, VendorBasic.class);
        int update = vendorService.update(vendorBasic);
        return updateResult(update);
    }
}
