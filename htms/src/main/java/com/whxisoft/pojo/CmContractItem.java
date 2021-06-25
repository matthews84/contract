package com.whxisoft.pojo;


import com.alibaba.fastjson.annotation.JSONField;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CmContractItem")
public class CmContractItem {
    @JSONField(name = "GUID")
    private String GUID;
    @JSONField(name = "ID")
    private String ID;
    private String intFlag;
    private String strCode;
    private String strName;
    private String dblQuantity;
    private String strMeasureUnit;
    private String dblTaxRatio;
    private String dblDiscountRatio;
    private String dblUntaxPrice;
    private String dblUntaxPriceRMB;
    private String dblPrice;
    private String dblPriceRMB;
    private String dblUntaxSum;
    private String dblUntaxSumRMB;
    private String dblSum;
    private String dblSumRMB;
    private String dblUntaxExecSum;
    private String dblUntaxExecSumRMB;
    private String dblExecSum;
    private String dblExecSumRMB;
    private String dtStartDate;
    private String dtEndDate;
    private String strChief;
    private String strCorrSource;
    private String strCorrItemID;
    private String strInvoiceID;
    private String strMemo;
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
    private String dblExecQuantity;
    private String strXMDL;
    private String strContractID;
    private String intEnd;
    @JSONField(name = "RowGUID")
    private String RowGUID;
    private String strSpare1;
    private String strSpare2;
    private String strSpare3;
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
    private String cInvDefine1;
    private String cInvDefine2;
    private String cInvDefine3;
    private String cInvDefine4;
    private String cInvDefine5;
    private String cInvDefine6;
    private String cInvDefine7;
    private String cInvDefine8;
    private String cInvDefine9;
    private String cInvDefine10;
    private String cInvDefine11;
    private String cInvDefine12;
    private String cInvDefine13;
    private String cInvDefine14;
    private String cInvDefine15;
    private String cInvDefine16;
    private String cInvStd;
    private String cCusCode;
    private String cVenCode;
    @JSONField(name = "AuxMeasureUnit")
    private String AuxMeasureUnit;
    @JSONField(name = "ConversionRate")
    private String ConversionRate;
    @JSONField(name = "PieceNum")
    private String PieceNum;
    @JSONField(name = "ExecPieceNum")
    private String ExecPieceNum;
    private String iInvRCost;
    private String cInvAddCode;
    private String decZbjRatio;
    private String decNoRateZbjMoney;
    private String decNoRateZbjBenBiMoney;
    private String decZbjMoney;
    private String decZbjBenbiMoney;
    private String dtZbjStartDate;
    private String dtZbjEndDate;
    private String iAppIds;
    private String cAppCode;
    private String cItem_Class;
    private String cItemCCode;
    private String cItemName;

    private Long cid;
    private Long pid;
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


    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIntFlag() {
        return intFlag;
    }

    public void setIntFlag(String intFlag) {
        this.intFlag = intFlag;
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

    public String getDblQuantity() {
        return dblQuantity;
    }

    public void setDblQuantity(String dblQuantity) {
        this.dblQuantity = dblQuantity;
    }

    public String getStrMeasureUnit() {
        return strMeasureUnit;
    }

    public void setStrMeasureUnit(String strMeasureUnit) {
        this.strMeasureUnit = strMeasureUnit;
    }

    public String getDblTaxRatio() {
        return dblTaxRatio;
    }

    public void setDblTaxRatio(String dblTaxRatio) {
        this.dblTaxRatio = dblTaxRatio;
    }

    public String getDblDiscountRatio() {
        return dblDiscountRatio;
    }

    public void setDblDiscountRatio(String dblDiscountRatio) {
        this.dblDiscountRatio = dblDiscountRatio;
    }

    public String getDblUntaxPrice() {
        return dblUntaxPrice;
    }

    public void setDblUntaxPrice(String dblUntaxPrice) {
        this.dblUntaxPrice = dblUntaxPrice;
    }

    public String getDblUntaxPriceRMB() {
        return dblUntaxPriceRMB;
    }

    public void setDblUntaxPriceRMB(String dblUntaxPriceRMB) {
        this.dblUntaxPriceRMB = dblUntaxPriceRMB;
    }

    public String getDblPrice() {
        return dblPrice;
    }

    public void setDblPrice(String dblPrice) {
        this.dblPrice = dblPrice;
    }

    public String getDblPriceRMB() {
        return dblPriceRMB;
    }

    public void setDblPriceRMB(String dblPriceRMB) {
        this.dblPriceRMB = dblPriceRMB;
    }

    public String getDblUntaxSum() {
        return dblUntaxSum;
    }

    public void setDblUntaxSum(String dblUntaxSum) {
        this.dblUntaxSum = dblUntaxSum;
    }

    public String getDblUntaxSumRMB() {
        return dblUntaxSumRMB;
    }

    public void setDblUntaxSumRMB(String dblUntaxSumRMB) {
        this.dblUntaxSumRMB = dblUntaxSumRMB;
    }

    public String getDblSum() {
        return dblSum;
    }

    public void setDblSum(String dblSum) {
        this.dblSum = dblSum;
    }

    public String getDblSumRMB() {
        return dblSumRMB;
    }

    public void setDblSumRMB(String dblSumRMB) {
        this.dblSumRMB = dblSumRMB;
    }

    public String getDblUntaxExecSum() {
        return dblUntaxExecSum;
    }

    public void setDblUntaxExecSum(String dblUntaxExecSum) {
        this.dblUntaxExecSum = dblUntaxExecSum;
    }

    public String getDblUntaxExecSumRMB() {
        return dblUntaxExecSumRMB;
    }

    public void setDblUntaxExecSumRMB(String dblUntaxExecSumRMB) {
        this.dblUntaxExecSumRMB = dblUntaxExecSumRMB;
    }

    public String getDblExecSum() {
        return dblExecSum;
    }

    public void setDblExecSum(String dblExecSum) {
        this.dblExecSum = dblExecSum;
    }

    public String getDblExecSumRMB() {
        return dblExecSumRMB;
    }

    public void setDblExecSumRMB(String dblExecSumRMB) {
        this.dblExecSumRMB = dblExecSumRMB;
    }

    public String getDtStartDate() {
        return dtStartDate;
    }

    public void setDtStartDate(String dtStartDate) {
        this.dtStartDate = dtStartDate;
    }

    public String getDtEndDate() {
        return dtEndDate;
    }

    public void setDtEndDate(String dtEndDate) {
        this.dtEndDate = dtEndDate;
    }

    public String getStrChief() {
        return strChief;
    }

    public void setStrChief(String strChief) {
        this.strChief = strChief;
    }

    public String getStrCorrSource() {
        return strCorrSource;
    }

    public void setStrCorrSource(String strCorrSource) {
        this.strCorrSource = strCorrSource;
    }

    public String getStrCorrItemID() {
        return strCorrItemID;
    }

    public void setStrCorrItemID(String strCorrItemID) {
        this.strCorrItemID = strCorrItemID;
    }

    public String getStrInvoiceID() {
        return strInvoiceID;
    }

    public void setStrInvoiceID(String strInvoiceID) {
        this.strInvoiceID = strInvoiceID;
    }

    public String getStrMemo() {
        return strMemo;
    }

    public void setStrMemo(String strMemo) {
        this.strMemo = strMemo;
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

    public String getDblExecQuantity() {
        return dblExecQuantity;
    }

    public void setDblExecQuantity(String dblExecQuantity) {
        this.dblExecQuantity = dblExecQuantity;
    }

    public String getStrXMDL() {
        return strXMDL;
    }

    public void setStrXMDL(String strXMDL) {
        this.strXMDL = strXMDL;
    }

    public String getStrContractID() {
        return strContractID;
    }

    public void setStrContractID(String strContractID) {
        this.strContractID = strContractID;
    }

    public String getIntEnd() {
        return intEnd;
    }

    public void setIntEnd(String intEnd) {
        this.intEnd = intEnd;
    }

    public String getRowGUID() {
        return RowGUID;
    }

    public void setRowGUID(String rowGUID) {
        RowGUID = rowGUID;
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

    public String getcInvDefine1() {
        return cInvDefine1;
    }

    public void setcInvDefine1(String cInvDefine1) {
        this.cInvDefine1 = cInvDefine1;
    }

    public String getcInvDefine2() {
        return cInvDefine2;
    }

    public void setcInvDefine2(String cInvDefine2) {
        this.cInvDefine2 = cInvDefine2;
    }

    public String getcInvDefine3() {
        return cInvDefine3;
    }

    public void setcInvDefine3(String cInvDefine3) {
        this.cInvDefine3 = cInvDefine3;
    }

    public String getcInvDefine4() {
        return cInvDefine4;
    }

    public void setcInvDefine4(String cInvDefine4) {
        this.cInvDefine4 = cInvDefine4;
    }

    public String getcInvDefine5() {
        return cInvDefine5;
    }

    public void setcInvDefine5(String cInvDefine5) {
        this.cInvDefine5 = cInvDefine5;
    }

    public String getcInvDefine6() {
        return cInvDefine6;
    }

    public void setcInvDefine6(String cInvDefine6) {
        this.cInvDefine6 = cInvDefine6;
    }

    public String getcInvDefine7() {
        return cInvDefine7;
    }

    public void setcInvDefine7(String cInvDefine7) {
        this.cInvDefine7 = cInvDefine7;
    }

    public String getcInvDefine8() {
        return cInvDefine8;
    }

    public void setcInvDefine8(String cInvDefine8) {
        this.cInvDefine8 = cInvDefine8;
    }

    public String getcInvDefine9() {
        return cInvDefine9;
    }

    public void setcInvDefine9(String cInvDefine9) {
        this.cInvDefine9 = cInvDefine9;
    }

    public String getcInvDefine10() {
        return cInvDefine10;
    }

    public void setcInvDefine10(String cInvDefine10) {
        this.cInvDefine10 = cInvDefine10;
    }

    public String getcInvDefine11() {
        return cInvDefine11;
    }

    public void setcInvDefine11(String cInvDefine11) {
        this.cInvDefine11 = cInvDefine11;
    }

    public String getcInvDefine12() {
        return cInvDefine12;
    }

    public void setcInvDefine12(String cInvDefine12) {
        this.cInvDefine12 = cInvDefine12;
    }

    public String getcInvDefine13() {
        return cInvDefine13;
    }

    public void setcInvDefine13(String cInvDefine13) {
        this.cInvDefine13 = cInvDefine13;
    }

    public String getcInvDefine14() {
        return cInvDefine14;
    }

    public void setcInvDefine14(String cInvDefine14) {
        this.cInvDefine14 = cInvDefine14;
    }

    public String getcInvDefine15() {
        return cInvDefine15;
    }

    public void setcInvDefine15(String cInvDefine15) {
        this.cInvDefine15 = cInvDefine15;
    }

    public String getcInvDefine16() {
        return cInvDefine16;
    }

    public void setcInvDefine16(String cInvDefine16) {
        this.cInvDefine16 = cInvDefine16;
    }

    public String getcInvStd() {
        return cInvStd;
    }

    public void setcInvStd(String cInvStd) {
        this.cInvStd = cInvStd;
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

    public String getPieceNum() {
        return PieceNum;
    }

    public void setPieceNum(String pieceNum) {
        PieceNum = pieceNum;
    }

    public String getExecPieceNum() {
        return ExecPieceNum;
    }

    public void setExecPieceNum(String execPieceNum) {
        ExecPieceNum = execPieceNum;
    }

    public String getiInvRCost() {
        return iInvRCost;
    }

    public void setiInvRCost(String iInvRCost) {
        this.iInvRCost = iInvRCost;
    }

    public String getcInvAddCode() {
        return cInvAddCode;
    }

    public void setcInvAddCode(String cInvAddCode) {
        this.cInvAddCode = cInvAddCode;
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

    public String getDecNoRateZbjBenBiMoney() {
        return decNoRateZbjBenBiMoney;
    }

    public void setDecNoRateZbjBenBiMoney(String decNoRateZbjBenBiMoney) {
        this.decNoRateZbjBenBiMoney = decNoRateZbjBenBiMoney;
    }

    public String getDecZbjMoney() {
        return decZbjMoney;
    }

    public void setDecZbjMoney(String decZbjMoney) {
        this.decZbjMoney = decZbjMoney;
    }

    public String getDecZbjBenbiMoney() {
        return decZbjBenbiMoney;
    }

    public void setDecZbjBenbiMoney(String decZbjBenbiMoney) {
        this.decZbjBenbiMoney = decZbjBenbiMoney;
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

    public String getiAppIds() {
        return iAppIds;
    }

    public void setiAppIds(String iAppIds) {
        this.iAppIds = iAppIds;
    }

    public String getcAppCode() {
        return cAppCode;
    }

    public void setcAppCode(String cAppCode) {
        this.cAppCode = cAppCode;
    }

    public String getcItem_Class() {
        return cItem_Class;
    }

    public void setcItem_Class(String cItem_Class) {
        this.cItem_Class = cItem_Class;
    }

    public String getcItemCCode() {
        return cItemCCode;
    }

    public void setcItemCCode(String cItemCCode) {
        this.cItemCCode = cItemCCode;
    }

    public String getcItemName() {
        return cItemName;
    }

    public void setcItemName(String cItemName) {
        this.cItemName = cItemName;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
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
