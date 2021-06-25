package com.whxisoft.pojo.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class ContractItemExcel {
    private Long cid;
    private Long pid;
    private Integer lev;
    @Excel(name = "标的编码")
    private String strCode;//标的编码
    @Excel(name = "标的名称")
    private String strName;//标的名称
    @Excel(name = "单位")
    private String strMeasureUnit;//单位
    @Excel(name = "数量")
    private String dblQuantity;//数量
    @Excel(name = "单价")
    private String dblPriceRMB;//单价
    @Excel(name = "金额")
    private String dblSumRMB;//金额
    @Excel(name = "开始时间")
    @JSONField(format = "yyyy-MM-dd")
    private Date dtStartDate;//开始时间
    @Excel(name = "结束时间")
    @JSONField(format = "yyyy-MM-dd")
    private Date dtEndDate;//结束时间
    @Excel(name = "备注")
    private String strMemo;//备注

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public String getStrCode() {
        return strCode;
    }

    public void setStrCode(String strCode) {
        this.strCode = strCode;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrMeasureUnit() {
        return strMeasureUnit;
    }

    public void setStrMeasureUnit(String strMeasureUnit) {
        this.strMeasureUnit = strMeasureUnit;
    }

    public String getDblQuantity() {
        return dblQuantity;
    }

    public void setDblQuantity(String dblQuantity) {
        this.dblQuantity = dblQuantity;
    }

    public String getDblPriceRMB() {
        return dblPriceRMB;
    }

    public void setDblPriceRMB(String dblPriceRMB) {
        this.dblPriceRMB = dblPriceRMB;
    }

    public String getDblSumRMB() {
        return dblSumRMB;
    }

    public void setDblSumRMB(String dblSumRMB) {
        this.dblSumRMB = dblSumRMB;
    }

    public Date getDtStartDate() {
        return dtStartDate;
    }

    public void setDtStartDate(Date dtStartDate) {
        this.dtStartDate = dtStartDate;
    }

    public Date getDtEndDate() {
        return dtEndDate;
    }

    public void setDtEndDate(Date dtEndDate) {
        this.dtEndDate = dtEndDate;
    }

    public String getStrMemo() {
        return strMemo;
    }

    public void setStrMemo(String strMemo) {
        this.strMemo = strMemo;
    }
}
