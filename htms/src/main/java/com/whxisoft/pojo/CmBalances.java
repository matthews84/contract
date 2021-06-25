package com.whxisoft.pojo;

import com.alibaba.fastjson.annotation.JSONField;

/*
 * 结算单子表
 * */
public class CmBalances extends BaseEntity {
    private String cBalanceID;
    private String id;
    @JSONField(name = "Guid")
    private String Guid;
    private String cCode;
    private String cItemClass;
    private String strCode;

    public String getStrCode() {
        return strCode;
    }

    public void setStrCode(String strCode) {
        this.strCode = strCode;
    }

    private String cItemSource;
    private String cItemID;
    private String decCount;
    private String cUnit;
    private String decRate;
    private String decNoRateUnitPrice;
    private String decRateMoney;
    private String decNoRateMoney;
    private String decRateUnitPrice;
    @JSONField(name = "Agio")
    private String Agio;
    private String cRemark;
    @JSONField(name = "Modifytamp")
    private String Modifytamp;
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
    @JSONField(name = "BalancesGuid")
    private String BalancesGuid;
    private String strSpare1;
    private String strSpare2;
    private String strSpare3;
    private String decRMB;
    private String cKmCode;
    private String decSum;
    private String decSumRMB;
    private String decNoRateRMB;
    private String cCusCode;
    private String cVenCode;
    @JSONField(name = "AuxMeasureUnit")
    private String AuxMeasureUnit;
    @JSONField(name = "ConversionRate")
    private String ConversionRate;
    @JSONField(name = "ExecPieceNum")
    private String ExecPieceNum;
    private String cExecID;
    @JSONField(name = "ExecDetailGUID")
    private String ExecDetailGUID;
    @JSONField(name = "SrcBalancesGuid")
    private String SrcBalancesGuid;
    private String decZbjRatio;
    private String decNoRateZbjMoney;
    private String decZbjMoney;
    private String dtZbjStartDate;
    private String dtZbjEndDate;
    private String cStageCode;
    private String dtStageEndDate;
    @JSONField(name = "BalanceGuid")
    private String BalanceGuid;
    private String cFree1;
    private String cFree2;
    private String cFree3;
    private String cFree4;
    private String cFree5;
    private String cFree6;
    private String cFree7;
    private String cFree8;
    private String cFree9;
    private String cFree10;
    private String cInvCode;
    private String cItemName;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGuid() {
        return Guid;
    }

    public void setGuid(String guid) {
        Guid = guid;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getcItemClass() {
        return cItemClass;
    }

    public void setcItemClass(String cItemClass) {
        this.cItemClass = cItemClass;
    }

    public String getcItemSource() {
        return cItemSource;
    }

    public void setcItemSource(String cItemSource) {
        this.cItemSource = cItemSource;
    }

    public String getcItemID() {
        return cItemID;
    }

    public void setcItemID(String cItemID) {
        this.cItemID = cItemID;
    }

    public String getDecCount() {
        return decCount;
    }

    public void setDecCount(String decCount) {
        this.decCount = decCount;
    }

    public String getcUnit() {
        return cUnit;
    }

    public void setcUnit(String cUnit) {
        this.cUnit = cUnit;
    }

    public String getDecRate() {
        return decRate;
    }

    public void setDecRate(String decRate) {
        this.decRate = decRate;
    }

    public String getDecNoRateUnitPrice() {
        return decNoRateUnitPrice;
    }

    public void setDecNoRateUnitPrice(String decNoRateUnitPrice) {
        this.decNoRateUnitPrice = decNoRateUnitPrice;
    }

    public String getDecRateMoney() {
        return decRateMoney;
    }

    public void setDecRateMoney(String decRateMoney) {
        this.decRateMoney = decRateMoney;
    }

    public String getDecNoRateMoney() {
        return decNoRateMoney;
    }

    public void setDecNoRateMoney(String decNoRateMoney) {
        this.decNoRateMoney = decNoRateMoney;
    }

    public String getDecRateUnitPrice() {
        return decRateUnitPrice;
    }

    public void setDecRateUnitPrice(String decRateUnitPrice) {
        this.decRateUnitPrice = decRateUnitPrice;
    }

    public String getAgio() {
        return Agio;
    }

    public void setAgio(String agio) {
        Agio = agio;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark;
    }

    public String getModifytamp() {
        return Modifytamp;
    }

    public void setModifytamp(String modifytamp) {
        Modifytamp = modifytamp;
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

    public String getBalancesGuid() {
        return BalancesGuid;
    }

    public void setBalancesGuid(String balancesGuid) {
        BalancesGuid = balancesGuid;
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

    public String getDecRMB() {
        return decRMB;
    }

    public void setDecRMB(String decRMB) {
        this.decRMB = decRMB;
    }

    public String getcKmCode() {
        return cKmCode;
    }

    public void setcKmCode(String cKmCode) {
        this.cKmCode = cKmCode;
    }

    public String getDecSum() {
        return decSum;
    }

    public void setDecSum(String decSum) {
        this.decSum = decSum;
    }

    public String getDecSumRMB() {
        return decSumRMB;
    }

    public void setDecSumRMB(String decSumRMB) {
        this.decSumRMB = decSumRMB;
    }

    public String getDecNoRateRMB() {
        return decNoRateRMB;
    }

    public void setDecNoRateRMB(String decNoRateRMB) {
        this.decNoRateRMB = decNoRateRMB;
    }

    public String getcCusCode() {
        return cCusCode;
    }

    public void setcCusCode(String cCusCode) {
        this.cCusCode = cCusCode;
    }

    public String getcVenCode() {
        return cVenCode;
    }

    public void setcVenCode(String cVenCode) {
        this.cVenCode = cVenCode;
    }

    public String getAuxMeasureUnit() {
        return AuxMeasureUnit;
    }

    public void setAuxMeasureUnit(String auxMeasureUnit) {
        AuxMeasureUnit = auxMeasureUnit;
    }

    public String getConversionRate() {
        return ConversionRate;
    }

    public void setConversionRate(String conversionRate) {
        ConversionRate = conversionRate;
    }

    public String getExecPieceNum() {
        return ExecPieceNum;
    }

    public void setExecPieceNum(String execPieceNum) {
        ExecPieceNum = execPieceNum;
    }

    public String getcExecID() {
        return cExecID;
    }

    public void setcExecID(String cExecID) {
        this.cExecID = cExecID;
    }

    public String getExecDetailGUID() {
        return ExecDetailGUID;
    }

    public void setExecDetailGUID(String execDetailGUID) {
        ExecDetailGUID = execDetailGUID;
    }

    public String getSrcBalancesGuid() {
        return SrcBalancesGuid;
    }

    public void setSrcBalancesGuid(String srcBalancesGuid) {
        SrcBalancesGuid = srcBalancesGuid;
    }

    public String getDecZbjRatio() {
        return decZbjRatio;
    }

    public void setDecZbjRatio(String decZbjRatio) {
        this.decZbjRatio = decZbjRatio;
    }

    public String getDecNoRateZbjMoney() {
        return decNoRateZbjMoney;
    }

    public void setDecNoRateZbjMoney(String decNoRateZbjMoney) {
        this.decNoRateZbjMoney = decNoRateZbjMoney;
    }

    public String getDecZbjMoney() {
        return decZbjMoney;
    }

    public void setDecZbjMoney(String decZbjMoney) {
        this.decZbjMoney = decZbjMoney;
    }

    public String getDtZbjStartDate() {
        return dtZbjStartDate;
    }

    public void setDtZbjStartDate(String dtZbjStartDate) {
        this.dtZbjStartDate = dtZbjStartDate;
    }

    public String getDtZbjEndDate() {
        return dtZbjEndDate;
    }

    public void setDtZbjEndDate(String dtZbjEndDate) {
        this.dtZbjEndDate = dtZbjEndDate;
    }

    public String getcStageCode() {
        return cStageCode;
    }

    public void setcStageCode(String cStageCode) {
        this.cStageCode = cStageCode;
    }

    public String getDtStageEndDate() {
        return dtStageEndDate;
    }

    public void setDtStageEndDate(String dtStageEndDate) {
        this.dtStageEndDate = dtStageEndDate;
    }

    public String getBalanceGuid() {
        return BalanceGuid;
    }

    public void setBalanceGuid(String balanceGuid) {
        BalanceGuid = balanceGuid;
    }

    public String getcFree1() {
        return cFree1;
    }

    public void setcFree1(String cFree1) {
        this.cFree1 = cFree1;
    }

    public String getcFree2() {
        return cFree2;
    }

    public void setcFree2(String cFree2) {
        this.cFree2 = cFree2;
    }

    public String getcFree3() {
        return cFree3;
    }

    public void setcFree3(String cFree3) {
        this.cFree3 = cFree3;
    }

    public String getcFree4() {
        return cFree4;
    }

    public void setcFree4(String cFree4) {
        this.cFree4 = cFree4;
    }

    public String getcFree5() {
        return cFree5;
    }

    public void setcFree5(String cFree5) {
        this.cFree5 = cFree5;
    }

    public String getcFree6() {
        return cFree6;
    }

    public void setcFree6(String cFree6) {
        this.cFree6 = cFree6;
    }

    public String getcFree7() {
        return cFree7;
    }

    public void setcFree7(String cFree7) {
        this.cFree7 = cFree7;
    }

    public String getcFree8() {
        return cFree8;
    }

    public void setcFree8(String cFree8) {
        this.cFree8 = cFree8;
    }

    public String getcFree9() {
        return cFree9;
    }

    public void setcFree9(String cFree9) {
        this.cFree9 = cFree9;
    }

    public String getcFree10() {
        return cFree10;
    }

    public void setcFree10(String cFree10) {
        this.cFree10 = cFree10;
    }

    public String getcInvCode() {
        return cInvCode;
    }

    public void setcInvCode(String cInvCode) {
        this.cInvCode = cInvCode;
    }

    public String getcItemName() {
        return cItemName;
    }

    public void setcItemName(String cItemName) {
        this.cItemName = cItemName;
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
        return "CmBalances{" +
                "cBalanceID='" + cBalanceID + '\'' +
                ", id='" + id + '\'' +
                ", Guid='" + Guid + '\'' +
                ", cCode='" + cCode + '\'' +
                ", cItemClass='" + cItemClass + '\'' +
                ", cItemSource='" + cItemSource + '\'' +
                ", cItemID='" + cItemID + '\'' +
                ", decCount='" + decCount + '\'' +
                ", cUnit='" + cUnit + '\'' +
                ", decRate='" + decRate + '\'' +
                ", decNoRateUnitPrice='" + decNoRateUnitPrice + '\'' +
                ", decRateMoney='" + decRateMoney + '\'' +
                ", decNoRateMoney='" + decNoRateMoney + '\'' +
                ", decRateUnitPrice='" + decRateUnitPrice + '\'' +
                ", Agio='" + Agio + '\'' +
                ", cRemark='" + cRemark + '\'' +
                ", Modifytamp='" + Modifytamp + '\'' +
                ", cDefine22='" + cDefine22 + '\'' +
                ", cDefine23='" + cDefine23 + '\'' +
                ", cDefine24='" + cDefine24 + '\'' +
                ", cDefine25='" + cDefine25 + '\'' +
                ", cDefine26='" + cDefine26 + '\'' +
                ", cDefine27='" + cDefine27 + '\'' +
                ", cDefine28='" + cDefine28 + '\'' +
                ", cDefine29='" + cDefine29 + '\'' +
                ", cDefine30='" + cDefine30 + '\'' +
                ", cDefine31='" + cDefine31 + '\'' +
                ", cDefine32='" + cDefine32 + '\'' +
                ", cDefine33='" + cDefine33 + '\'' +
                ", cDefine34='" + cDefine34 + '\'' +
                ", cDefine35='" + cDefine35 + '\'' +
                ", cDefine36='" + cDefine36 + '\'' +
                ", cDefine37='" + cDefine37 + '\'' +
                ", BalancesGuid='" + BalancesGuid + '\'' +
                ", strSpare1='" + strSpare1 + '\'' +
                ", strSpare2='" + strSpare2 + '\'' +
                ", strSpare3='" + strSpare3 + '\'' +
                ", decRMB='" + decRMB + '\'' +
                ", cKmCode='" + cKmCode + '\'' +
                ", decSum='" + decSum + '\'' +
                ", decSumRMB='" + decSumRMB + '\'' +
                ", decNoRateRMB='" + decNoRateRMB + '\'' +
                ", cCusCode='" + cCusCode + '\'' +
                ", cVenCode='" + cVenCode + '\'' +
                ", AuxMeasureUnit='" + AuxMeasureUnit + '\'' +
                ", ConversionRate='" + ConversionRate + '\'' +
                ", ExecPieceNum='" + ExecPieceNum + '\'' +
                ", cExecID='" + cExecID + '\'' +
                ", ExecDetailGUID='" + ExecDetailGUID + '\'' +
                ", SrcBalancesGuid='" + SrcBalancesGuid + '\'' +
                ", decZbjRatio='" + decZbjRatio + '\'' +
                ", decNoRateZbjMoney='" + decNoRateZbjMoney + '\'' +
                ", decZbjMoney='" + decZbjMoney + '\'' +
                ", dtZbjStartDate='" + dtZbjStartDate + '\'' +
                ", dtZbjEndDate='" + dtZbjEndDate + '\'' +
                ", cStageCode='" + cStageCode + '\'' +
                ", dtStageEndDate='" + dtStageEndDate + '\'' +
                ", BalanceGuid='" + BalanceGuid + '\'' +
                ", cFree1='" + cFree1 + '\'' +
                ", cFree2='" + cFree2 + '\'' +
                ", cFree3='" + cFree3 + '\'' +
                ", cFree4='" + cFree4 + '\'' +
                ", cFree5='" + cFree5 + '\'' +
                ", cFree6='" + cFree6 + '\'' +
                ", cFree7='" + cFree7 + '\'' +
                ", cFree8='" + cFree8 + '\'' +
                ", cFree9='" + cFree9 + '\'' +
                ", cFree10='" + cFree10 + '\'' +
                ", cInvCode='" + cInvCode + '\'' +
                ", cItemName='" + cItemName + '\'' +
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
