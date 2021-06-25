package com.whxisoft.pojo.proc;

import com.alibaba.fastjson.annotation.JSONField;

public class ContractAndItem {
    @JSONField(name = "GUID")
    private String GUID;
    private String strContractID;
    private String strContractName;
    private String dblTotalCurrency;
    private String dblTotalQuantity;
    @JSONField(name = "RowGUID")
    private String RowGUID;
    private String strCode;
    private String strName;
    private String strMeasureUnit;
    private String dblQuantity;
    private String dblPriceRMB;
    private String dblSumRMB;

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

    public String getStrContractName() {
        return strContractName;
    }

    public void setStrContractName(String strContractName) {
        this.strContractName = strContractName;
    }

    public String getDblTotalCurrency() {
        return dblTotalCurrency;
    }

    public void setDblTotalCurrency(String dblTotalCurrency) {
        this.dblTotalCurrency = dblTotalCurrency;
    }

    public String getRowGUID() {
        return RowGUID;
    }

    public void setRowGUID(String rowGUID) {
        RowGUID = rowGUID;
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

    public String getDblTotalQuantity() {        return dblTotalQuantity;    }

    public void setDblTotalQuantity(String dblTotalQuantity) {        this.dblTotalQuantity = dblTotalQuantity;    }
}
