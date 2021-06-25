package com.whxisoft.pojo.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alibaba.fastjson.annotation.JSONField;
import com.whxisoft.constant.ContractStatus;

import java.util.Date;

public class ContractExcel {
    @Excel(name = "合同编号")
    private String strContractID; //合同编号
    @Excel(name = "合同名称")
    private String strContractName; //合同名称
    @Excel(name = "合同性质")
    private String strContractKind;//合同性质
    @Excel(name = "合同类型")
    private String strContractType;//合同类型
    @Excel(name = "委托单位")
    private String strBisectionUnit;//委托单位
    @Excel(name = "制单日期")
    @JSONField(format = "yyyy-MM-dd")
    private Date strSetupDate;//制单日期
    @Excel(name = "生效日期")
    @JSONField(format = "yyyy-MM-dd")
    private Date strInureDate;//生效日期
    @Excel(name = "结案日期")
    @JSONField(format = "yyyy-MM-dd")
    private Date strEndCaseDate;//结案日期

    private String iStatus = ContractStatus.SAVE;
    private String contractStatus = ContractStatus.SAVE;
    private String strCurrency = "人民币";
    private String dblExchange = "1";

    public String getStrContractID() {
        return strContractID;
    }

    public void setStrContractID(String strContractID) {
        this.strContractID = strContractID;
    }

    public String getStrContractName() {
        return strContractName;
    }

    public void setStrContractName(String strContractName) {
        this.strContractName = strContractName;
    }

    public String getStrContractKind() {
        return strContractKind;
    }

    public void setStrContractKind(String strContractKind) {
        this.strContractKind = strContractKind;
    }

    public String getStrContractType() {
        return strContractType;
    }

    public void setStrContractType(String strContractType) {
        this.strContractType = strContractType;
    }

    public String getStrBisectionUnit() {
        return strBisectionUnit;
    }

    public void setStrBisectionUnit(String strBisectionUnit) {
        this.strBisectionUnit = strBisectionUnit;
    }

    public Date getStrSetupDate() {
        return strSetupDate;
    }

    public void setStrSetupDate(Date strSetupDate) {
        this.strSetupDate = strSetupDate;
    }

    public Date getStrInureDate() {
        return strInureDate;
    }

    public void setStrInureDate(Date strInureDate) {
        this.strInureDate = strInureDate;
    }

    public Date getStrEndCaseDate() {
        return strEndCaseDate;
    }

    public void setStrEndCaseDate(Date strEndCaseDate) {
        this.strEndCaseDate = strEndCaseDate;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getStrCurrency() {
        return strCurrency;
    }

    public void setStrCurrency(String strCurrency) {
        this.strCurrency = strCurrency;
    }

    public String getDblExchange() {
        return dblExchange;
    }

    public void setDblExchange(String dblExchange) {
        this.dblExchange = dblExchange;
    }
}
