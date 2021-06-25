package com.whxisoft.pojo.proc;

public class FundPlansSearch {
    private String strContractID;
    private String strContractName;
    private String strContractType;
    private String strBisectionUnit;
    private String strContractStartDate;
    private String strContractEndDate;

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

    public String getStrContractStartDate() {
        return strContractStartDate;
    }

    public void setStrContractStartDate(String strContractStartDate) {
        this.strContractStartDate = strContractStartDate;
    }

    public String getStrContractEndDate() {
        return strContractEndDate;
    }

    public void setStrContractEndDate(String strContractEndDate) {
        this.strContractEndDate = strContractEndDate;
    }


    @Override
    public String toString() {
        return "FundPlansSearch{" +
                "strContractID='" + strContractID + '\'' +
                ", strContractName='" + strContractName + '\'' +
                ", strBisectionUnit='" + strBisectionUnit + '\'' +
                ", strContractStartDate='" + strContractStartDate + '\'' +
                ", strContractEndDate='" + strContractEndDate + '\'' +
                ", strContractType='" + strContractType + '\'' +
                '}';
    }
}
