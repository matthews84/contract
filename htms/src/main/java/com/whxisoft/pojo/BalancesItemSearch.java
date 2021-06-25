package com.whxisoft.pojo;


public class BalancesItemSearch {
    private String cContractID;
    private String cBalanceID;
    private String cUnit;
    private String startDate;
    private String endDate;
    private int flag;

    public String getcContractID() {
        return cContractID;
    }

    public void setcContractID(String cContractID) {
        this.cContractID = cContractID;
    }

    public String getcBalanceID() {
        return cBalanceID;
    }

    public void setcBalanceID(String cBalanceID) {
        this.cBalanceID = cBalanceID;
    }

    public String getcUnit() {
        return cUnit;
    }

    public void setcUnit(String cUnit) {
        this.cUnit = cUnit;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
