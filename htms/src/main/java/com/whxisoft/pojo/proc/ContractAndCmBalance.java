package com.whxisoft.pojo.proc;

import com.alibaba.fastjson.annotation.JSONField;
import com.whxisoft.pojo.CmContract;

/**
 * @auther suhang
 * @date 2020/11/16 - 9:08
 */
public class ContractAndCmBalance extends CmContract{
    @JSONField(name = "cBalanceID")
    private String cBalanceID;  //结算单号
    private Double decRateMoney;  //结算总金额
    private String strContractName; //合同名称
    private String strBisectionUnit; //对方名称

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

    public String getStrContractName() {
        return strContractName;
    }

    public void setStrContractName(String strContractName) {
        this.strContractName = strContractName;
    }

    public String getStrBisectionUnit() {
        return strBisectionUnit;
    }

    public void setStrBisectionUnit(String strBisectionUnit) {
        this.strBisectionUnit = strBisectionUnit;
    }

}
