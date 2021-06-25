package com.whxisoft.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CmContractPay")
public class CmContractPay {
    @JSONField(name = "ID")
    private String ID;
    @JSONField(name = "GUID")
    private String GUID;
    private String lngRowID;
    private String dtPayDate;
    private String dblPayRatio;
    private String dblPayCurrency;
    private String strSettleStyleID;
    private String strPayFactor;
    private String strExp;
    private String dblTotalCurrency;
    private String dblExecCurrency;
    private String dblTotalQuantity;
    private String dblExecQuqantity;
    //    private String tsTime;
    private String strContractID;
    private String strSpare1;
    private String strSpare2;
    private String strSpare3;
    private String cItemCode;
    private String iItemPercent;
    private String cStageGroupCode;
    private String cStageCode;
    private String dtStageExpectedEndDate;
    private String dblPayCurrencyBenBi;
    private String cDefine22;
    private String cDefine23;
    private String cDefine24;
    private String cDefine25;
    private String cDefine26;
    private String cDefine27;
    private String cDefine28;
    private String cDefine29;
    private String cDefine30;
    private String cDefine31;
    private String cDefine32;
    private String cDefine33;
    private String cDefine34;
    private String cDefine35;
    private String cDefine36;
    private String cDefine37;

    private String contractId;
    private String contractRowId;
    private String dr;
    private String ts;
//    private String htdef1;
//    private String htdef2;
//    private String htdef3;
//    private String htdef4;
//    private String htdef5;
//    private String htdef6;
//    private String htdef7;
//    private String htdef8;
//    private String htdef9;
//    private String htdef10;
//    private String htdef11;
//    private String htdef12;
//    private String htdef13;
//    private String htdef14;
//    private String htdef15;
//    private String htdef16;
//    private String htdef17;
//    private String htdef18;
//    private String htdef19;
//    private String htdef20;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public String getLngRowID() {
        return lngRowID;
    }

    public void setLngRowID(String lngRowID) {
        this.lngRowID = lngRowID;
    }

    public String getDtPayDate() {
        return dtPayDate;
    }

    public void setDtPayDate(String dtPayDate) {
        this.dtPayDate = dtPayDate;
    }

    public String getDblPayRatio() {
        return dblPayRatio;
    }

    public void setDblPayRatio(String dblPayRatio) {
        this.dblPayRatio = dblPayRatio;
    }

    public String getDblPayCurrency() {
        return dblPayCurrency;
    }

    public void setDblPayCurrency(String dblPayCurrency) {
        this.dblPayCurrency = dblPayCurrency;
    }

    public String getStrSettleStyleID() {
        return strSettleStyleID;
    }

    public void setStrSettleStyleID(String strSettleStyleID) {
        this.strSettleStyleID = strSettleStyleID;
    }

    public String getStrPayFactor() {
        return strPayFactor;
    }

    public void setStrPayFactor(String strPayFactor) {
        this.strPayFactor = strPayFactor;
    }

    public String getStrExp() {
        return strExp;
    }

    public void setStrExp(String strExp) {
        this.strExp = strExp;
    }

    public String getDblTotalCurrency() {
        return dblTotalCurrency;
    }

    public void setDblTotalCurrency(String dblTotalCurrency) {
        this.dblTotalCurrency = dblTotalCurrency;
    }

    public String getDblExecCurrency() {
        return dblExecCurrency;
    }

    public void setDblExecCurrency(String dblExecCurrency) {
        this.dblExecCurrency = dblExecCurrency;
    }

    public String getDblTotalQuantity() {
        return dblTotalQuantity;
    }

    public void setDblTotalQuantity(String dblTotalQuantity) {
        this.dblTotalQuantity = dblTotalQuantity;
    }

    public String getDblExecQuqantity() {
        return dblExecQuqantity;
    }

    public void setDblExecQuqantity(String dblExecQuqantity) {
        this.dblExecQuqantity = dblExecQuqantity;
    }

    public String getStrContractID() {
        return strContractID;
    }

    public void setStrContractID(String strContractID) {
        this.strContractID = strContractID;
    }

    public String getStrSpare1() {
        return strSpare1;
    }

    public void setStrSpare1(String strSpare1) {
        this.strSpare1 = strSpare1;
    }

    public String getStrSpare2() {
        return strSpare2;
    }

    public void setStrSpare2(String strSpare2) {
        this.strSpare2 = strSpare2;
    }

    public String getStrSpare3() {
        return strSpare3;
    }

    public void setStrSpare3(String strSpare3) {
        this.strSpare3 = strSpare3;
    }

    public String getcItemCode() {
        return cItemCode;
    }

    public void setcItemCode(String cItemCode) {
        this.cItemCode = cItemCode;
    }

    public String getiItemPercent() {
        return iItemPercent;
    }

    public void setiItemPercent(String iItemPercent) {
        this.iItemPercent = iItemPercent;
    }

    public String getcStageGroupCode() {
        return cStageGroupCode;
    }

    public void setcStageGroupCode(String cStageGroupCode) {
        this.cStageGroupCode = cStageGroupCode;
    }

    public String getcStageCode() {
        return cStageCode;
    }

    public void setcStageCode(String cStageCode) {
        this.cStageCode = cStageCode;
    }

    public String getDtStageExpectedEndDate() {
        return dtStageExpectedEndDate;
    }

    public void setDtStageExpectedEndDate(String dtStageExpectedEndDate) {
        this.dtStageExpectedEndDate = dtStageExpectedEndDate;
    }

    public String getDblPayCurrencyBenBi() {
        return dblPayCurrencyBenBi;
    }

    public void setDblPayCurrencyBenBi(String dblPayCurrencyBenBi) {
        this.dblPayCurrencyBenBi = dblPayCurrencyBenBi;
    }

    public String getcDefine22() {
        return cDefine22;
    }

    public void setcDefine22(String cDefine22) {
        this.cDefine22 = cDefine22;
    }

    public String getcDefine23() {
        return cDefine23;
    }

    public void setcDefine23(String cDefine23) {
        this.cDefine23 = cDefine23;
    }

    public String getcDefine24() {
        return cDefine24;
    }

    public void setcDefine24(String cDefine24) {
        this.cDefine24 = cDefine24;
    }

    public String getcDefine25() {
        return cDefine25;
    }

    public void setcDefine25(String cDefine25) {
        this.cDefine25 = cDefine25;
    }

    public String getcDefine26() {
        return cDefine26;
    }

    public void setcDefine26(String cDefine26) {
        this.cDefine26 = cDefine26;
    }

    public String getcDefine27() {
        return cDefine27;
    }

    public void setcDefine27(String cDefine27) {
        this.cDefine27 = cDefine27;
    }

    public String getcDefine28() {
        return cDefine28;
    }

    public void setcDefine28(String cDefine28) {
        this.cDefine28 = cDefine28;
    }

    public String getcDefine29() {
        return cDefine29;
    }

    public void setcDefine29(String cDefine29) {
        this.cDefine29 = cDefine29;
    }

    public String getcDefine30() {
        return cDefine30;
    }

    public void setcDefine30(String cDefine30) {
        this.cDefine30 = cDefine30;
    }

    public String getcDefine31() {
        return cDefine31;
    }

    public void setcDefine31(String cDefine31) {
        this.cDefine31 = cDefine31;
    }

    public String getcDefine32() {
        return cDefine32;
    }

    public void setcDefine32(String cDefine32) {
        this.cDefine32 = cDefine32;
    }

    public String getcDefine33() {
        return cDefine33;
    }

    public void setcDefine33(String cDefine33) {
        this.cDefine33 = cDefine33;
    }

    public String getcDefine34() {
        return cDefine34;
    }

    public void setcDefine34(String cDefine34) {
        this.cDefine34 = cDefine34;
    }

    public String getcDefine35() {
        return cDefine35;
    }

    public void setcDefine35(String cDefine35) {
        this.cDefine35 = cDefine35;
    }

    public String getcDefine36() {
        return cDefine36;
    }

    public void setcDefine36(String cDefine36) {
        this.cDefine36 = cDefine36;
    }

    public String getcDefine37() {
        return cDefine37;
    }

    public void setcDefine37(String cDefine37) {
        this.cDefine37 = cDefine37;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractRowId() {
        return contractRowId;
    }

    public void setContractRowId(String contractRowId) {
        this.contractRowId = contractRowId;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
}
