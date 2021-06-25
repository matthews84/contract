package com.whxisoft.pojo.proc;

import com.alibaba.fastjson.annotation.JSONField;


public class ContractAndItemAndCmBalance extends ContractAndItem {
    @JSONField(name = "cBalanceID")
    private String cBalanceID;  //结算单编号
    private Double decRateMoney;  //结算总金额
    private String decCount;
    private int decRateUnitPrice;

    private ContractAndItem contractAndItem;

    public String getcBalanceID() {
        return cBalanceID;
    }

    public void setcBalanceID(String cBalanceID) {
        this.cBalanceID = cBalanceID;
    }

    public Double getDecRateMoney() {
        return decRateMoney;
    }

    public void setDecRateMoney(Double decRateMoney) {
        this.decRateMoney = decRateMoney;
    }

    public ContractAndItem getContractAndItem() {
        return contractAndItem;
    }

    public void setContractAndItem(ContractAndItem contractAndItem) {
        this.contractAndItem = contractAndItem;
    }

    public String getDecCount() {        return decCount;    }

    public void setDecCount(String decCount) {        this.decCount = decCount;    }

    public int getDecRateUnitPrice() {        return decRateUnitPrice;    }

    public void setDecRateUnitPrice(int decRateUnitPrice) {        this.decRateUnitPrice = decRateUnitPrice;    }
}
