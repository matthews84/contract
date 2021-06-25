package com.whxisoft.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/*
 * 结算单主表实体类
 * */
public class CmBalance extends BaseEntity {
    private String cBalanceID;
    @JSONField(name = "GUID")
    private String GUID;
    private String cContractID;  //
    private String cDeptID;
    private String cFunctionaryID;
    private String cBalancelTypeID;
    private String decExchangeRate;
    private String strContractName;
    private String cDefine2;
    private String cDefine3;
    private String cDefine4;
    private String cDefine5;
    private String cDefine6;
    private String strBisectionUnit;
    private String cDefine8;
    private String cDefine9;
    private String cDefine10;
    private String cDefine11;
    private String cDefine12;
    private String cDefine13;
    private String cDefine14;
    private String cDefine15;
    private String cDefine16;
    private String cBalanceDetails;
    private String cProducer;
    private String dtProduceDate;
    private String cAuditer;
    private String dtAuditeDate;
    private String cSuperviseDept;
    private String intTemplateShowID;
    private String intTemplatePrintID;
    @JSONField(name = "Modifytamp")
    private String Modifytamp;
    private String bitUseFlag;
    private String strSpare1;
    private String strSpare2;
    private String strSpare3;
    private String intPre;
    private String cAdmin;
    private String dtAdminDate;
    private String cPZID;
    private String cPayCode;
    private String bd_c;
    private String cDefine;
    private String cGatheringPlan;
    private String dCreditStart;
    private String iCreditPeriod;
    private String dGatheringDate;
    private String bCredit;
    private String cBalanceSource;
    private String cJsdType;
    private String cSrcBalanceID;
    private String intVaryID;
    private String dtCreateTime;
    private String dtModifyTime;
    private String dtModifyDate;
    private String dtEffectTime;
    private String cModifer;
    @JSONField(name = "BalanceGuid")
    private String BalanceGuid;
    @JSONField(name = "IsWfControlled")
    private String IsWfControlled;
    private String iverifystate;
    private String ireturncount;
    private String cPZNum;
    private String iPrintCount;
    private String doutbilldate;
    @JSONField(name = "DR")
    private String DR;
    @JSONField(name = "TS")
    private String TS;
    private String HTDEF1;
    private String HTDEF2;
    private String HTDEF3;
    private String HTDEF4;
    private String HTDEF5;
    private String HTDEF6;
    private String HTDEF7;
    private String HTDEF8;
    private String HTDEF9;
    private String HTDEF10;
    private String HTDEF11;
    private String HTDEF12;
    private String HTDEF13;
    private String HTDEF14;
    private String HTDEF15;
    private String HTDEF16;
    private String HTDEF17;
    private String HTDEF18;
    private String HTDEF19;
    private String HTDEF20;

    public String getcBalanceID() {
        return cBalanceID;
    }

    public void setcBalanceID(String cBalanceID) {
        this.cBalanceID = cBalanceID;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public String getcContractID() {
        return cContractID;
    }

    public void setcContractID(String cContractID) {
        this.cContractID = cContractID;
    }

    public String getcDeptID() {
        return cDeptID;
    }

    public void setcDeptID(String cDeptID) {
        this.cDeptID = cDeptID;
    }

    public String getcFunctionaryID() {
        return cFunctionaryID;
    }

    public void setcFunctionaryID(String cFunctionaryID) {
        this.cFunctionaryID = cFunctionaryID;
    }

    public String getcBalancelTypeID() {
        return cBalancelTypeID;
    }

    public void setcBalancelTypeID(String cBalancelTypeID) {
        this.cBalancelTypeID = cBalancelTypeID;
    }

    public String getDecExchangeRate() {
        return decExchangeRate;
    }

    public void setDecExchangeRate(String decExchangeRate) {
        this.decExchangeRate = decExchangeRate;
    }

    public String getcDefine2() {
        return cDefine2;
    }

    public void setcDefine2(String cDefine2) {
        this.cDefine2 = cDefine2;
    }

    public String getcDefine3() {
        return cDefine3;
    }

    public void setcDefine3(String cDefine3) {
        this.cDefine3 = cDefine3;
    }

    public String getcDefine4() {
        return cDefine4;
    }

    public void setcDefine4(String cDefine4) {
        this.cDefine4 = cDefine4;
    }

    public String getcDefine5() {
        return cDefine5;
    }

    public void setcDefine5(String cDefine5) {
        this.cDefine5 = cDefine5;
    }

    public String getcDefine6() {
        return cDefine6;
    }

    public void setcDefine6(String cDefine6) {
        this.cDefine6 = cDefine6;
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

    public String getcDefine8() {
        return cDefine8;
    }

    public void setcDefine8(String cDefine8) {
        this.cDefine8 = cDefine8;
    }

    public String getcDefine9() {
        return cDefine9;
    }

    public void setcDefine9(String cDefine9) {
        this.cDefine9 = cDefine9;
    }

    public String getcDefine10() {
        return cDefine10;
    }

    public void setcDefine10(String cDefine10) {
        this.cDefine10 = cDefine10;
    }

    public String getcDefine11() {
        return cDefine11;
    }

    public void setcDefine11(String cDefine11) {
        this.cDefine11 = cDefine11;
    }

    public String getcDefine12() {
        return cDefine12;
    }

    public void setcDefine12(String cDefine12) {
        this.cDefine12 = cDefine12;
    }

    public String getcDefine13() {
        return cDefine13;
    }

    public void setcDefine13(String cDefine13) {
        this.cDefine13 = cDefine13;
    }

    public String getcDefine14() {
        return cDefine14;
    }

    public void setcDefine14(String cDefine14) {
        this.cDefine14 = cDefine14;
    }

    public String getcDefine15() {
        return cDefine15;
    }

    public void setcDefine15(String cDefine15) {
        this.cDefine15 = cDefine15;
    }

    public String getcDefine16() {
        return cDefine16;
    }

    public void setcDefine16(String cDefine16) {
        this.cDefine16 = cDefine16;
    }

    public String getcBalanceDetails() {
        return cBalanceDetails;
    }

    public void setcBalanceDetails(String cBalanceDetails) {
        this.cBalanceDetails = cBalanceDetails;
    }

    public String getcProducer() {
        return cProducer;
    }

    public void setcProducer(String cProducer) {
        this.cProducer = cProducer;
    }

    public String getDtProduceDate() {
        return dtProduceDate;
    }

    public void setDtProduceDate(String dtProduceDate) {
        this.dtProduceDate = dtProduceDate;
    }

    public String getcAuditer() {
        return cAuditer;
    }

    public void setcAuditer(String cAuditer) {
        this.cAuditer = cAuditer;
    }

    public String getDtAuditeDate() {
        return dtAuditeDate;
    }

    public void setDtAuditeDate(String dtAuditeDate) {
        this.dtAuditeDate = dtAuditeDate;
    }

    public String getcSuperviseDept() {
        return cSuperviseDept;
    }

    public void setcSuperviseDept(String cSuperviseDept) {
        this.cSuperviseDept = cSuperviseDept;
    }

    public String getIntTemplateShowID() {
        return intTemplateShowID;
    }

    public void setIntTemplateShowID(String intTemplateShowID) {
        this.intTemplateShowID = intTemplateShowID;
    }

    public String getIntTemplatePrintID() {
        return intTemplatePrintID;
    }

    public void setIntTemplatePrintID(String intTemplatePrintID) {
        this.intTemplatePrintID = intTemplatePrintID;
    }

    public String getModifytamp() {
        return Modifytamp;
    }

    public void setModifytamp(String modifytamp) {
        Modifytamp = modifytamp;
    }

    public String getBitUseFlag() {
        return bitUseFlag;
    }

    public void setBitUseFlag(String bitUseFlag) {
        this.bitUseFlag = bitUseFlag;
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

    public String getIntPre() {
        return intPre;
    }

    public void setIntPre(String intPre) {
        this.intPre = intPre;
    }

    public String getcAdmin() {
        return cAdmin;
    }

    public void setcAdmin(String cAdmin) {
        this.cAdmin = cAdmin;
    }

    public String getDtAdminDate() {
        return dtAdminDate;
    }

    public void setDtAdminDate(String dtAdminDate) {
        this.dtAdminDate = dtAdminDate;
    }

    public String getcPZID() {
        return cPZID;
    }

    public void setcPZID(String cPZID) {
        this.cPZID = cPZID;
    }

    public String getcPayCode() {
        return cPayCode;
    }

    public void setcPayCode(String cPayCode) {
        this.cPayCode = cPayCode;
    }

    public String getBd_c() {
        return bd_c;
    }

    public void setBd_c(String bd_c) {
        this.bd_c = bd_c;
    }

    public String getcDefine() {
        return cDefine;
    }

    public void setcDefine(String cDefine) {
        this.cDefine = cDefine;
    }

    public String getcGatheringPlan() {
        return cGatheringPlan;
    }

    public void setcGatheringPlan(String cGatheringPlan) {
        this.cGatheringPlan = cGatheringPlan;
    }

    public String getdCreditStart() {
        return dCreditStart;
    }

    public void setdCreditStart(String dCreditStart) {
        this.dCreditStart = dCreditStart;
    }

    public String getiCreditPeriod() {
        return iCreditPeriod;
    }

    public void setiCreditPeriod(String iCreditPeriod) {
        this.iCreditPeriod = iCreditPeriod;
    }

    public String getdGatheringDate() {
        return dGatheringDate;
    }

    public void setdGatheringDate(String dGatheringDate) {
        this.dGatheringDate = dGatheringDate;
    }

    public String getbCredit() {
        return bCredit;
    }

    public void setbCredit(String bCredit) {
        this.bCredit = bCredit;
    }

    public String getcBalanceSource() {
        return cBalanceSource;
    }

    public void setcBalanceSource(String cBalanceSource) {
        this.cBalanceSource = cBalanceSource;
    }

    public String getcJsdType() {
        return cJsdType;
    }

    public void setcJsdType(String cJsdType) {
        this.cJsdType = cJsdType;
    }

    public String getcSrcBalanceID() {
        return cSrcBalanceID;
    }

    public void setcSrcBalanceID(String cSrcBalanceID) {
        this.cSrcBalanceID = cSrcBalanceID;
    }

    public String getIntVaryID() {
        return intVaryID;
    }

    public void setIntVaryID(String intVaryID) {
        this.intVaryID = intVaryID;
    }

    public String getDtCreateTime() {
        return dtCreateTime;
    }

    public void setDtCreateTime(String dtCreateTime) {
        this.dtCreateTime = dtCreateTime;
    }

    public String getDtModifyTime() {
        return dtModifyTime;
    }

    public void setDtModifyTime(String dtModifyTime) {
        this.dtModifyTime = dtModifyTime;
    }

    public String getDtModifyDate() {
        return dtModifyDate;
    }

    public void setDtModifyDate(String dtModifyDate) {
        this.dtModifyDate = dtModifyDate;
    }

    public String getDtEffectTime() {
        return dtEffectTime;
    }

    public void setDtEffectTime(String dtEffectTime) {
        this.dtEffectTime = dtEffectTime;
    }

    public String getcModifer() {
        return cModifer;
    }

    public void setcModifer(String cModifer) {
        this.cModifer = cModifer;
    }

    public String getBalanceGuid() {
        return BalanceGuid;
    }

    public void setBalanceGuid(String balanceGuid) {
        BalanceGuid = balanceGuid;
    }

    public String getIsWfControlled() {
        return IsWfControlled;
    }

    public void setIsWfControlled(String isWfControlled) {
        IsWfControlled = isWfControlled;
    }

    public String getIverifystate() {
        return iverifystate;
    }

    public void setIverifystate(String iverifystate) {
        this.iverifystate = iverifystate;
    }

    public String getIreturncount() {
        return ireturncount;
    }

    public void setIreturncount(String ireturncount) {
        this.ireturncount = ireturncount;
    }

    public String getcPZNum() {
        return cPZNum;
    }

    public void setcPZNum(String cPZNum) {
        this.cPZNum = cPZNum;
    }

    public String getiPrintCount() {
        return iPrintCount;
    }

    public void setiPrintCount(String iPrintCount) {
        this.iPrintCount = iPrintCount;
    }

    public String getDoutbilldate() {
        return doutbilldate;
    }

    public void setDoutbilldate(String doutbilldate) {
        this.doutbilldate = doutbilldate;
    }

    public String getDR() {
        return DR;
    }

    public void setDR(String DR) {
        this.DR = DR;
    }

    public String getTS() {
        return TS;
    }

    public void setTS(String TS) {
        this.TS = TS;
    }

    public String getHTDEF1() {
        return HTDEF1;
    }

    public void setHTDEF1(String HTDEF1) {
        this.HTDEF1 = HTDEF1;
    }

    public String getHTDEF2() {
        return HTDEF2;
    }

    public void setHTDEF2(String HTDEF2) {
        this.HTDEF2 = HTDEF2;
    }

    public String getHTDEF3() {
        return HTDEF3;
    }

    public void setHTDEF3(String HTDEF3) {
        this.HTDEF3 = HTDEF3;
    }

    public String getHTDEF4() {
        return HTDEF4;
    }

    public void setHTDEF4(String HTDEF4) {
        this.HTDEF4 = HTDEF4;
    }

    public String getHTDEF5() {
        return HTDEF5;
    }

    public void setHTDEF5(String HTDEF5) {
        this.HTDEF5 = HTDEF5;
    }

    public String getHTDEF6() {
        return HTDEF6;
    }

    public void setHTDEF6(String HTDEF6) {
        this.HTDEF6 = HTDEF6;
    }

    public String getHTDEF7() {
        return HTDEF7;
    }

    public void setHTDEF7(String HTDEF7) {
        this.HTDEF7 = HTDEF7;
    }

    public String getHTDEF8() {
        return HTDEF8;
    }

    public void setHTDEF8(String HTDEF8) {
        this.HTDEF8 = HTDEF8;
    }

    public String getHTDEF9() {
        return HTDEF9;
    }

    public void setHTDEF9(String HTDEF9) {
        this.HTDEF9 = HTDEF9;
    }

    public String getHTDEF10() {
        return HTDEF10;
    }

    public void setHTDEF10(String HTDEF10) {
        this.HTDEF10 = HTDEF10;
    }

    public String getHTDEF11() {
        return HTDEF11;
    }

    public void setHTDEF11(String HTDEF11) {
        this.HTDEF11 = HTDEF11;
    }

    public String getHTDEF12() {
        return HTDEF12;
    }

    public void setHTDEF12(String HTDEF12) {
        this.HTDEF12 = HTDEF12;
    }

    public String getHTDEF13() {
        return HTDEF13;
    }

    public void setHTDEF13(String HTDEF13) {
        this.HTDEF13 = HTDEF13;
    }

    public String getHTDEF14() {
        return HTDEF14;
    }

    public void setHTDEF14(String HTDEF14) {
        this.HTDEF14 = HTDEF14;
    }

    public String getHTDEF15() {
        return HTDEF15;
    }

    public void setHTDEF15(String HTDEF15) {
        this.HTDEF15 = HTDEF15;
    }

    public String getHTDEF16() {
        return HTDEF16;
    }

    public void setHTDEF16(String HTDEF16) {
        this.HTDEF16 = HTDEF16;
    }

    public String getHTDEF17() {
        return HTDEF17;
    }

    public void setHTDEF17(String HTDEF17) {
        this.HTDEF17 = HTDEF17;
    }

    public String getHTDEF18() {
        return HTDEF18;
    }

    public void setHTDEF18(String HTDEF18) {
        this.HTDEF18 = HTDEF18;
    }

    public String getHTDEF19() {
        return HTDEF19;
    }

    public void setHTDEF19(String HTDEF19) {
        this.HTDEF19 = HTDEF19;
    }

    public String getHTDEF20() {
        return HTDEF20;
    }

    public void setHTDEF20(String HTDEF20) {
        this.HTDEF20 = HTDEF20;
    }

    @Override
    public String toString() {
        return "CmBalance{" +
                "cBalanceID='" + cBalanceID + '\'' +
                ", GUID='" + GUID + '\'' +
                ", cContractID='" + cContractID + '\'' +
                ", cDeptID='" + cDeptID + '\'' +
                ", cFunctionaryID='" + cFunctionaryID + '\'' +
                ", cBalancelTypeID='" + cBalancelTypeID + '\'' +
                ", decExchangeRate='" + decExchangeRate + '\'' +
                ", strContractName='" + strContractName + '\'' +
                ", cDefine2='" + cDefine2 + '\'' +
                ", cDefine3='" + cDefine3 + '\'' +
                ", cDefine4='" + cDefine4 + '\'' +
                ", cDefine5='" + cDefine5 + '\'' +
                ", cDefine6='" + cDefine6 + '\'' +
                ", strBisectionUnit='" + strBisectionUnit + '\'' +
                ", cDefine8='" + cDefine8 + '\'' +
                ", cDefine9='" + cDefine9 + '\'' +
                ", cDefine10='" + cDefine10 + '\'' +
                ", cDefine11='" + cDefine11 + '\'' +
                ", cDefine12='" + cDefine12 + '\'' +
                ", cDefine13='" + cDefine13 + '\'' +
                ", cDefine14='" + cDefine14 + '\'' +
                ", cDefine15='" + cDefine15 + '\'' +
                ", cDefine16='" + cDefine16 + '\'' +
                ", cBalanceDetails='" + cBalanceDetails + '\'' +
                ", cProducer='" + cProducer + '\'' +
                ", dtProduceDate='" + dtProduceDate + '\'' +
                ", cAuditer='" + cAuditer + '\'' +
                ", dtAuditeDate='" + dtAuditeDate + '\'' +
                ", cSuperviseDept='" + cSuperviseDept + '\'' +
                ", intTemplateShowID='" + intTemplateShowID + '\'' +
                ", intTemplatePrintID='" + intTemplatePrintID + '\'' +
                ", Modifytamp='" + Modifytamp + '\'' +
                ", bitUseFlag='" + bitUseFlag + '\'' +
                ", strSpare1='" + strSpare1 + '\'' +
                ", strSpare2='" + strSpare2 + '\'' +
                ", strSpare3='" + strSpare3 + '\'' +
                ", intPre='" + intPre + '\'' +
                ", cAdmin='" + cAdmin + '\'' +
                ", dtAdminDate='" + dtAdminDate + '\'' +
                ", cPZID='" + cPZID + '\'' +
                ", cPayCode='" + cPayCode + '\'' +
                ", bd_c='" + bd_c + '\'' +
                ", cDefine='" + cDefine + '\'' +
                ", cGatheringPlan='" + cGatheringPlan + '\'' +
                ", dCreditStart='" + dCreditStart + '\'' +
                ", iCreditPeriod='" + iCreditPeriod + '\'' +
                ", dGatheringDate='" + dGatheringDate + '\'' +
                ", bCredit='" + bCredit + '\'' +
                ", cBalanceSource='" + cBalanceSource + '\'' +
                ", cJsdType='" + cJsdType + '\'' +
                ", cSrcBalanceID='" + cSrcBalanceID + '\'' +
                ", intVaryID='" + intVaryID + '\'' +
                ", dtCreateTime='" + dtCreateTime + '\'' +
                ", dtModifyTime='" + dtModifyTime + '\'' +
                ", dtModifyDate='" + dtModifyDate + '\'' +
                ", dtEffectTime='" + dtEffectTime + '\'' +
                ", cModifer='" + cModifer + '\'' +
                ", BalanceGuid='" + BalanceGuid + '\'' +
                ", IsWfControlled='" + IsWfControlled + '\'' +
                ", iverifystate='" + iverifystate + '\'' +
                ", ireturncount='" + ireturncount + '\'' +
                ", cPZNum='" + cPZNum + '\'' +
                ", iPrintCount='" + iPrintCount + '\'' +
                ", doutbilldate='" + doutbilldate + '\'' +
                ", DR='" + DR + '\'' +
                ", TS='" + TS + '\'' +
                ", HTDEF1='" + HTDEF1 + '\'' +
                ", HTDEF2='" + HTDEF2 + '\'' +
                ", HTDEF3='" + HTDEF3 + '\'' +
                ", HTDEF4='" + HTDEF4 + '\'' +
                ", HTDEF5='" + HTDEF5 + '\'' +
                ", HTDEF6='" + HTDEF6 + '\'' +
                ", HTDEF7='" + HTDEF7 + '\'' +
                ", HTDEF8='" + HTDEF8 + '\'' +
                ", HTDEF9='" + HTDEF9 + '\'' +
                ", HTDEF10='" + HTDEF10 + '\'' +
                ", HTDEF11='" + HTDEF11 + '\'' +
                ", HTDEF12='" + HTDEF12 + '\'' +
                ", HTDEF13='" + HTDEF13 + '\'' +
                ", HTDEF14='" + HTDEF14 + '\'' +
                ", HTDEF15='" + HTDEF15 + '\'' +
                ", HTDEF16='" + HTDEF16 + '\'' +
                ", HTDEF17='" + HTDEF17 + '\'' +
                ", HTDEF18='" + HTDEF18 + '\'' +
                ", HTDEF19='" + HTDEF19 + '\'' +
                ", HTDEF20='" + HTDEF20 + '\'' +
                '}';
    }
}
