package com.whxisoft.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CmContract")
public class CmContract {
    @JSONField(name = "GUID")
    private String GUID;
    private String strContractID;
    private String strContractGrp;
    private String strContractType;
    private String strContractKind;
    private String strContractName;
    private String strBisectionUnit;
    private String strParentID;
    private String strRepair;
    private String strBisectionPerson;
    private String strContractOrderDate;
    private String strContractStartDate;
    private String strContractEndDate;
    private String strContractDesc;
    private String dblMassassureScale;
    private String dblMassassure;
    private String cDefine1;
    private String cDefine2;
    private String cDefine3;
    private String cDefine4;
    private String cDefine5;
    private String cDefine6;
    private String cDefine7;
    private String cDefine8;
    private String cDefine9;
    private String cDefine10;
    private String cDefine11;
    private String cDefine12;
    private String cDefine13;
    private String cDefine14;
    private String cDefine15;
    private String cDefine16;
    private String strSetupPerson;
    private String strSetupDate;
    private String strEndCasePerson;
    private String strEndCaseDate;
    private String strInurePerson;
    private String strInureDate;
    private String strDeptID;
    private String strPersonID;
    private String intVaryID;
    private String strVaryCauseID;
    private String dtVaryDate;
    private String strVaryPersonID;
    private String strVaryPassPersonID;
    private String intPre;
    private String strWay;
    private String strCurrency;
    private String dblExchange;
    private String strVaryPerson;
    //    private String tsTime;
    private String strSpare1;
    private String strSpare2;
    private String strSpare3;
    private String strSource;
    private String dblTotalCurrency;
    private String dblExecCurrency;
    private String dblTotalQuantity;
    private String dblExecQuqantity;
    private String cBusType;
    private String cSCCode;
    private String cGatheringPlan;
    private String IsWfControlled;
    private String IverifyState;
    private String IreturnCount;
    private String intAuditSymbol;
    private String cZbjComputeMode;
    private String dtZbjStartDate;
    private String dtZbjEndDate;
    private String bUseStage;
    private String cStageGroupCode;
    private String dtCreateTime;
    private String dtModifyTime;
    private String dtModifyDate;
    private String dtEffectTime;
    private String cModifer;
    private String dtVaryCreateDate;
    private String dtVaryCreateTime;
    private String dtVaryModifyTime;
    private String dtVaryModifyDate;
    private String dtVaryEffectTime;
    private String cVaryModifer;
    private String iStatus;
    private String intExecControlType;
    private String cExecControlVouch;
    private String iPrintCount;
    private String iincotermid;
    private String dlastladedate;
    private String csportcode;
    private String ctportcode;
    private String caportcode;

    private String contractId;
    private String contractStatus;
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

    public String getStrContractID() {
        return strContractID;
    }

    public void setStrContractID(String strContractID) {
        this.strContractID = strContractID;
    }

    public String getStrContractGrp() {
        return strContractGrp;
    }

    public void setStrContractGrp(String strContractGrp) {
        this.strContractGrp = strContractGrp;
    }

    public String getStrContractType() {
        return strContractType;
    }

    public void setStrContractType(String strContractType) {
        this.strContractType = strContractType;
    }

    public String getStrContractKind() {
        return strContractKind;
    }

    public void setStrContractKind(String strContractKind) {
        this.strContractKind = strContractKind;
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

    public String getStrParentID() {
        return strParentID;
    }

    public void setStrParentID(String strParentID) {
        this.strParentID = strParentID;
    }

    public String getStrRepair() {
        return strRepair;
    }

    public void setStrRepair(String strRepair) {
        this.strRepair = strRepair;
    }

    public String getStrBisectionPerson() {
        return strBisectionPerson;
    }

    public void setStrBisectionPerson(String strBisectionPerson) {
        this.strBisectionPerson = strBisectionPerson;
    }

    public String getStrContractOrderDate() {
        return strContractOrderDate;
    }

    public void setStrContractOrderDate(String strContractOrderDate) {
        this.strContractOrderDate = strContractOrderDate;
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

    public String getStrContractDesc() {
        return strContractDesc;
    }

    public void setStrContractDesc(String strContractDesc) {
        this.strContractDesc = strContractDesc;
    }

    public String getDblMassassureScale() {
        return dblMassassureScale;
    }

    public void setDblMassassureScale(String dblMassassureScale) {
        this.dblMassassureScale = dblMassassureScale;
    }

    public String getDblMassassure() {
        return dblMassassure;
    }

    public void setDblMassassure(String dblMassassure) {
        this.dblMassassure = dblMassassure;
    }

    public String getcDefine1() {
        return cDefine1;
    }

    public void setcDefine1(String cDefine1) {
        this.cDefine1 = cDefine1;
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

    public String getcDefine7() {
        return cDefine7;
    }

    public void setcDefine7(String cDefine7) {
        this.cDefine7 = cDefine7;
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

    public String getStrSetupPerson() {
        return strSetupPerson;
    }

    public void setStrSetupPerson(String strSetupPerson) {
        this.strSetupPerson = strSetupPerson;
    }

    public String getStrSetupDate() {
        return strSetupDate;
    }

    public void setStrSetupDate(String strSetupDate) {
        this.strSetupDate = strSetupDate;
    }

    public String getStrEndCasePerson() {
        return strEndCasePerson;
    }

    public void setStrEndCasePerson(String strEndCasePerson) {
        this.strEndCasePerson = strEndCasePerson;
    }

    public String getStrEndCaseDate() {
        return strEndCaseDate;
    }

    public void setStrEndCaseDate(String strEndCaseDate) {
        this.strEndCaseDate = strEndCaseDate;
    }

    public String getStrInurePerson() {
        return strInurePerson;
    }

    public void setStrInurePerson(String strInurePerson) {
        this.strInurePerson = strInurePerson;
    }

    public String getStrInureDate() {
        return strInureDate;
    }

    public void setStrInureDate(String strInureDate) {
        this.strInureDate = strInureDate;
    }

    public String getStrDeptID() {
        return strDeptID;
    }

    public void setStrDeptID(String strDeptID) {
        this.strDeptID = strDeptID;
    }

    public String getStrPersonID() {
        return strPersonID;
    }

    public void setStrPersonID(String strPersonID) {
        this.strPersonID = strPersonID;
    }

    public String getIntVaryID() {
        return intVaryID;
    }

    public void setIntVaryID(String intVaryID) {
        this.intVaryID = intVaryID;
    }

    public String getStrVaryCauseID() {
        return strVaryCauseID;
    }

    public void setStrVaryCauseID(String strVaryCauseID) {
        this.strVaryCauseID = strVaryCauseID;
    }

    public String getDtVaryDate() {
        return dtVaryDate;
    }

    public void setDtVaryDate(String dtVaryDate) {
        this.dtVaryDate = dtVaryDate;
    }

    public String getStrVaryPersonID() {
        return strVaryPersonID;
    }

    public void setStrVaryPersonID(String strVaryPersonID) {
        this.strVaryPersonID = strVaryPersonID;
    }

    public String getStrVaryPassPersonID() {
        return strVaryPassPersonID;
    }

    public void setStrVaryPassPersonID(String strVaryPassPersonID) {
        this.strVaryPassPersonID = strVaryPassPersonID;
    }

    public String getIntPre() {
        return intPre;
    }

    public void setIntPre(String intPre) {
        this.intPre = intPre;
    }

    public String getStrWay() {
        return strWay;
    }

    public void setStrWay(String strWay) {
        this.strWay = strWay;
    }

    public String getStrCurrency() {
        return strCurrency;
    }

    public void setStrCurrency(String strCurrency) {
        this.strCurrency = strCurrency;
    }

    public String getDblExchange() {
        return dblExchange;
    }

    public void setDblExchange(String dblExchange) {
        this.dblExchange = dblExchange;
    }

    public String getStrVaryPerson() {
        return strVaryPerson;
    }

    public void setStrVaryPerson(String strVaryPerson) {
        this.strVaryPerson = strVaryPerson;
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

    public String getStrSource() {
        return strSource;
    }

    public void setStrSource(String strSource) {
        this.strSource = strSource;
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

    public String getcBusType() {
        return cBusType;
    }

    public void setcBusType(String cBusType) {
        this.cBusType = cBusType;
    }

    public String getcSCCode() {
        return cSCCode;
    }

    public void setcSCCode(String cSCCode) {
        this.cSCCode = cSCCode;
    }

    public String getcGatheringPlan() {
        return cGatheringPlan;
    }

    public void setcGatheringPlan(String cGatheringPlan) {
        this.cGatheringPlan = cGatheringPlan;
    }

    public String getIsWfControlled() {
        return IsWfControlled;
    }

    public void setIsWfControlled(String isWfControlled) {
        IsWfControlled = isWfControlled;
    }

    public String getIverifyState() {
        return IverifyState;
    }

    public void setIverifyState(String iverifyState) {
        IverifyState = iverifyState;
    }

    public String getIreturnCount() {
        return IreturnCount;
    }

    public void setIreturnCount(String ireturnCount) {
        IreturnCount = ireturnCount;
    }

    public String getIntAuditSymbol() {
        return intAuditSymbol;
    }

    public void setIntAuditSymbol(String intAuditSymbol) {
        this.intAuditSymbol = intAuditSymbol;
    }

    public String getcZbjComputeMode() {
        return cZbjComputeMode;
    }

    public void setcZbjComputeMode(String cZbjComputeMode) {
        this.cZbjComputeMode = cZbjComputeMode;
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

    public String getbUseStage() {
        return bUseStage;
    }

    public void setbUseStage(String bUseStage) {
        this.bUseStage = bUseStage;
    }

    public String getcStageGroupCode() {
        return cStageGroupCode;
    }

    public void setcStageGroupCode(String cStageGroupCode) {
        this.cStageGroupCode = cStageGroupCode;
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

    public String getDtVaryCreateDate() {
        return dtVaryCreateDate;
    }

    public void setDtVaryCreateDate(String dtVaryCreateDate) {
        this.dtVaryCreateDate = dtVaryCreateDate;
    }

    public String getDtVaryCreateTime() {
        return dtVaryCreateTime;
    }

    public void setDtVaryCreateTime(String dtVaryCreateTime) {
        this.dtVaryCreateTime = dtVaryCreateTime;
    }

    public String getDtVaryModifyTime() {
        return dtVaryModifyTime;
    }

    public void setDtVaryModifyTime(String dtVaryModifyTime) {
        this.dtVaryModifyTime = dtVaryModifyTime;
    }

    public String getDtVaryModifyDate() {
        return dtVaryModifyDate;
    }

    public void setDtVaryModifyDate(String dtVaryModifyDate) {
        this.dtVaryModifyDate = dtVaryModifyDate;
    }

    public String getDtVaryEffectTime() {
        return dtVaryEffectTime;
    }

    public void setDtVaryEffectTime(String dtVaryEffectTime) {
        this.dtVaryEffectTime = dtVaryEffectTime;
    }

    public String getcVaryModifer() {
        return cVaryModifer;
    }

    public void setcVaryModifer(String cVaryModifer) {
        this.cVaryModifer = cVaryModifer;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getIntExecControlType() {
        return intExecControlType;
    }

    public void setIntExecControlType(String intExecControlType) {
        this.intExecControlType = intExecControlType;
    }

    public String getcExecControlVouch() {
        return cExecControlVouch;
    }

    public void setcExecControlVouch(String cExecControlVouch) {
        this.cExecControlVouch = cExecControlVouch;
    }

    public String getiPrintCount() {
        return iPrintCount;
    }

    public void setiPrintCount(String iPrintCount) {
        this.iPrintCount = iPrintCount;
    }

    public String getIincotermid() {
        return iincotermid;
    }

    public void setIincotermid(String iincotermid) {
        this.iincotermid = iincotermid;
    }

    public String getDlastladedate() {
        return dlastladedate;
    }

    public void setDlastladedate(String dlastladedate) {
        this.dlastladedate = dlastladedate;
    }

    public String getCsportcode() {
        return csportcode;
    }

    public void setCsportcode(String csportcode) {
        this.csportcode = csportcode;
    }

    public String getCtportcode() {
        return ctportcode;
    }

    public void setCtportcode(String ctportcode) {
        this.ctportcode = ctportcode;
    }

    public String getCaportcode() {
        return caportcode;
    }

    public void setCaportcode(String caportcode) {
        this.caportcode = caportcode;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
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
