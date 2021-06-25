package com.whxisoft.pojo;
/*
* CmContractView(注意其中有待定字段)
* */
public class CmContractView extends BaseEntity{
    //合同编码
    private  String strContractID;
    //原合同编码（待定）
    private  String cDefine11;
    //合同名称
    private String strContractName;
    //合同签订日期
    private String strContractOrderDate;
    //合同总金额
    private String cDefine22;
    //合同执行金额
    private String cDefine33;
    //质保金额度
    private String dblMassassure;
    //对方单位
    private String strBisectionUnit;
    //合同开始日期
    private String strContractStartDate;
    //合同结束日期
    private String strContractEndDate;

    public String getStrContractID() {
        return strContractID;
    }

    public void setStrContractID(String strContractID) {
        this.strContractID = strContractID;
    }

    public String getcDefine11() {
        return cDefine11;
    }

    public void setcDefine11(String cDefine11) {
        this.cDefine11 = cDefine11;
    }

    public String getStrContractName() {
        return strContractName;
    }

    public void setStrContractName(String strContractName) {
        this.strContractName = strContractName;
    }

    public String getStrContractOrderDate() {
        return strContractOrderDate;
    }

    public void setStrContractOrderDate(String strContractOrderDate) {
        this.strContractOrderDate = strContractOrderDate;
    }

    public String getcDefine22() {
        return cDefine22;
    }

    public void setcDefine22(String cDefine22) {
        this.cDefine22 = cDefine22;
    }

    public String getcDefine33() {
        return cDefine33;
    }

    public void setcDefine33(String cDefine33) {
        this.cDefine33 = cDefine33;
    }

    public String getDblMassassure() {
        return dblMassassure;
    }

    public void setDblMassassure(String dblMassassure) {
        this.dblMassassure = dblMassassure;
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
}
