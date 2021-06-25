package com.whxisoft.pojo;


import com.alibaba.fastjson.annotation.JSONField;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BalancesItem")
public class BalancesItem {
    @JSONField(name = "GUID")
    private String GUID;
    private String strContractID;
    private String strCode;
    private String strName;
    private String strMeasureUnit;
    private String dblTotalQuantity;
    private String dblPriceRMB;
    private String dblTotalCurrency;
    private String decCount;
    private int decRateUnitPrice;
    private String decRateMoney;

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public String getStrContractID() {
        return strContractID;
    }

    public void setStrContractID(String strContractID) {
        this.strContractID = strContractID;
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

    public String getDblTotalQuantity() {
        return dblTotalQuantity;
    }

    public void setDblTotalQuantity(String dblTotalQuantity) {
        this.dblTotalQuantity = dblTotalQuantity;
    }

    public String getDblPriceRMB() {
        return dblPriceRMB;
    }

    public void setDblPriceRMB(String dblPriceRMB) {
        this.dblPriceRMB = dblPriceRMB;
    }

    public String getDblTotalCurrency() {
        return dblTotalCurrency;
    }

    public void setDblTotalCurrency(String dblTotalCurrency) {
        this.dblTotalCurrency = dblTotalCurrency;
    }

    public String getDecCount() {
        return decCount;
    }

    public void setDecCount(String decCount) {
        this.decCount = decCount;
    }

    public int getDecRateUnitPrice() {
        return decRateUnitPrice;
    }

    public void setDecRateUnitPrice(int decRateUnitPrice) {
        this.decRateUnitPrice = decRateUnitPrice;
    }

    public String getDecRateMoney() {
        return decRateMoney;
    }

    public void setDecRateMoney(String decRateMoney) {
        this.decRateMoney = decRateMoney;
    }
}
