package com.example.springdemo.demo.entity;

import java.util.Date;

public class BasDept extends BasDeptKey {
    private String nodecode;

    private String deptname;

    private String shortname;

    private String parentid;

    private String isleaf;

    private String deptclass;

    private String clinicaltype;

    private String isaccdept;

    private String depttype;

    private String clcflag;

    private String emcflag;

    private String inpflag;

    private String matflag;

    private String herbsflag;

    private String cnmflag;

    private String wmflag;

    private Integer prepay;

    private String location;

    private String isdeleted;

    private String inputcpy;

    private String inputcwb;

    private String materialflag;

    private String mrid;

    private String storetype;

    private String isybzlfree;

    private String phonenumber;

    private String insdeptcode;

    private String operator;

    private Date operatetime;

    private String operatorip;

    private String paeflag;

    private String principal;

    private Date tracelog;

    private Date updateTime;

    private String integrateId;

    private String servicetimeStart;

    private String servicetimeEnd;

    private String associationDept;

    public BasDept(String hosnum, String deptcode, String nodecode, String deptname, String shortname, String parentid, String isleaf, String deptclass, String clinicaltype, String isaccdept, String depttype, String clcflag, String emcflag, String inpflag, String matflag, String herbsflag, String cnmflag, String wmflag, Integer prepay, String location, String isdeleted, String inputcpy, String inputcwb, String materialflag, String mrid, String storetype, String isybzlfree, String phonenumber, String insdeptcode, String operator, Date operatetime, String operatorip, String paeflag, String principal, Date tracelog, Date updateTime, String integrateId, String servicetimeStart, String servicetimeEnd, String associationDept) {
        super(hosnum, deptcode);
        this.nodecode = nodecode;
        this.deptname = deptname;
        this.shortname = shortname;
        this.parentid = parentid;
        this.isleaf = isleaf;
        this.deptclass = deptclass;
        this.clinicaltype = clinicaltype;
        this.isaccdept = isaccdept;
        this.depttype = depttype;
        this.clcflag = clcflag;
        this.emcflag = emcflag;
        this.inpflag = inpflag;
        this.matflag = matflag;
        this.herbsflag = herbsflag;
        this.cnmflag = cnmflag;
        this.wmflag = wmflag;
        this.prepay = prepay;
        this.location = location;
        this.isdeleted = isdeleted;
        this.inputcpy = inputcpy;
        this.inputcwb = inputcwb;
        this.materialflag = materialflag;
        this.mrid = mrid;
        this.storetype = storetype;
        this.isybzlfree = isybzlfree;
        this.phonenumber = phonenumber;
        this.insdeptcode = insdeptcode;
        this.operator = operator;
        this.operatetime = operatetime;
        this.operatorip = operatorip;
        this.paeflag = paeflag;
        this.principal = principal;
        this.tracelog = tracelog;
        this.updateTime = updateTime;
        this.integrateId = integrateId;
        this.servicetimeStart = servicetimeStart;
        this.servicetimeEnd = servicetimeEnd;
        this.associationDept = associationDept;
    }

    public BasDept() {
        super();
    }

    public String getNodecode() {
        return nodecode;
    }

    public void setNodecode(String nodecode) {
        this.nodecode = nodecode == null ? null : nodecode.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(String isleaf) {
        this.isleaf = isleaf == null ? null : isleaf.trim();
    }

    public String getDeptclass() {
        return deptclass;
    }

    public void setDeptclass(String deptclass) {
        this.deptclass = deptclass == null ? null : deptclass.trim();
    }

    public String getClinicaltype() {
        return clinicaltype;
    }

    public void setClinicaltype(String clinicaltype) {
        this.clinicaltype = clinicaltype == null ? null : clinicaltype.trim();
    }

    public String getIsaccdept() {
        return isaccdept;
    }

    public void setIsaccdept(String isaccdept) {
        this.isaccdept = isaccdept == null ? null : isaccdept.trim();
    }

    public String getDepttype() {
        return depttype;
    }

    public void setDepttype(String depttype) {
        this.depttype = depttype == null ? null : depttype.trim();
    }

    public String getClcflag() {
        return clcflag;
    }

    public void setClcflag(String clcflag) {
        this.clcflag = clcflag == null ? null : clcflag.trim();
    }

    public String getEmcflag() {
        return emcflag;
    }

    public void setEmcflag(String emcflag) {
        this.emcflag = emcflag == null ? null : emcflag.trim();
    }

    public String getInpflag() {
        return inpflag;
    }

    public void setInpflag(String inpflag) {
        this.inpflag = inpflag == null ? null : inpflag.trim();
    }

    public String getMatflag() {
        return matflag;
    }

    public void setMatflag(String matflag) {
        this.matflag = matflag == null ? null : matflag.trim();
    }

    public String getHerbsflag() {
        return herbsflag;
    }

    public void setHerbsflag(String herbsflag) {
        this.herbsflag = herbsflag == null ? null : herbsflag.trim();
    }

    public String getCnmflag() {
        return cnmflag;
    }

    public void setCnmflag(String cnmflag) {
        this.cnmflag = cnmflag == null ? null : cnmflag.trim();
    }

    public String getWmflag() {
        return wmflag;
    }

    public void setWmflag(String wmflag) {
        this.wmflag = wmflag == null ? null : wmflag.trim();
    }

    public Integer getPrepay() {
        return prepay;
    }

    public void setPrepay(Integer prepay) {
        this.prepay = prepay;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(String isdeleted) {
        this.isdeleted = isdeleted == null ? null : isdeleted.trim();
    }

    public String getInputcpy() {
        return inputcpy;
    }

    public void setInputcpy(String inputcpy) {
        this.inputcpy = inputcpy == null ? null : inputcpy.trim();
    }

    public String getInputcwb() {
        return inputcwb;
    }

    public void setInputcwb(String inputcwb) {
        this.inputcwb = inputcwb == null ? null : inputcwb.trim();
    }

    public String getMaterialflag() {
        return materialflag;
    }

    public void setMaterialflag(String materialflag) {
        this.materialflag = materialflag == null ? null : materialflag.trim();
    }

    public String getMrid() {
        return mrid;
    }

    public void setMrid(String mrid) {
        this.mrid = mrid == null ? null : mrid.trim();
    }

    public String getStoretype() {
        return storetype;
    }

    public void setStoretype(String storetype) {
        this.storetype = storetype == null ? null : storetype.trim();
    }

    public String getIsybzlfree() {
        return isybzlfree;
    }

    public void setIsybzlfree(String isybzlfree) {
        this.isybzlfree = isybzlfree == null ? null : isybzlfree.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getInsdeptcode() {
        return insdeptcode;
    }

    public void setInsdeptcode(String insdeptcode) {
        this.insdeptcode = insdeptcode == null ? null : insdeptcode.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    public String getOperatorip() {
        return operatorip;
    }

    public void setOperatorip(String operatorip) {
        this.operatorip = operatorip == null ? null : operatorip.trim();
    }

    public String getPaeflag() {
        return paeflag;
    }

    public void setPaeflag(String paeflag) {
        this.paeflag = paeflag == null ? null : paeflag.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public Date getTracelog() {
        return tracelog;
    }

    public void setTracelog(Date tracelog) {
        this.tracelog = tracelog;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIntegrateId() {
        return integrateId;
    }

    public void setIntegrateId(String integrateId) {
        this.integrateId = integrateId == null ? null : integrateId.trim();
    }

    public String getServicetimeStart() {
        return servicetimeStart;
    }

    public void setServicetimeStart(String servicetimeStart) {
        this.servicetimeStart = servicetimeStart == null ? null : servicetimeStart.trim();
    }

    public String getServicetimeEnd() {
        return servicetimeEnd;
    }

    public void setServicetimeEnd(String servicetimeEnd) {
        this.servicetimeEnd = servicetimeEnd == null ? null : servicetimeEnd.trim();
    }

    public String getAssociationDept() {
        return associationDept;
    }

    public void setAssociationDept(String associationDept) {
        this.associationDept = associationDept == null ? null : associationDept.trim();
    }
}