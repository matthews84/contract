package com.whxisoft.pojo.proc;

public class ContractAndItemSearch {
    private String strContractID;
    private String strContractName;
    private String strBisectionUnit;
    private String strContractStartDate;
    private String strContractEndDate;
    private String valid;

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

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    @Override
    public String toString() {
        return "ContractAndItemSearch{" +
                "strContractID='" + strContractID + '\'' +
                ", strContractName='" + strContractName + '\'' +
                ", strBisectionUnit='" + strBisectionUnit + '\'' +
                ", strContractStartDate='" + strContractStartDate + '\'' +
                ", strContractEndDate='" + strContractEndDate + '\'' +
                ", valid='" + valid + '\'' +
                '}';
    }
}
