package com.delta.scm.config.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WipCountEntity {
    private String pdlineno;

    private String mono;

    private String shiftno;

    private String opno;

    private BigDecimal curqty;

    private BigDecimal targetqty;

    private BigDecimal goalrate;

    private BigDecimal unitruntime;

    private BigDecimal sumcurqty;

    private BigDecimal sumtargetqty;

    private BigDecimal sumgoalrate;

    private Date starttime;

    private Short usercount;

    private Date endtime;

    private Date logouttime;

    private BigDecimal logoutexceptiontime;

    private BigDecimal setuptime;

    private BigDecimal stdsetuptime;

    public String getPdlineno() {
        return pdlineno;
    }

    public void setPdlineno(String pdlineno) {
        this.pdlineno = pdlineno;
    }

    public String getMono() {
        return mono;
    }

    public void setMono(String mono) {
        this.mono = mono;
    }

    public String getShiftno() {
        return shiftno;
    }

    public void setShiftno(String shiftno) {
        this.shiftno = shiftno;
    }

    public String getOpno() {
        return opno;
    }

    public void setOpno(String opno) {
        this.opno = opno;
    }

    public BigDecimal getCurqty() {
        return curqty;
    }

    public void setCurqty(BigDecimal curqty) {
        this.curqty = curqty;
    }

    public BigDecimal getTargetqty() {
        return targetqty;
    }

    public void setTargetqty(BigDecimal targetqty) {
        this.targetqty = targetqty;
    }

    public BigDecimal getGoalrate() {
        return goalrate;
    }

    public void setGoalrate(BigDecimal goalrate) {
        this.goalrate = goalrate;
    }

    public BigDecimal getUnitruntime() {
        return unitruntime;
    }

    public void setUnitruntime(BigDecimal unitruntime) {
        this.unitruntime = unitruntime;
    }

    public BigDecimal getSumcurqty() {
        return sumcurqty;
    }

    public void setSumcurqty(BigDecimal sumcurqty) {
        this.sumcurqty = sumcurqty;
    }

    public BigDecimal getSumtargetqty() {
        return sumtargetqty;
    }

    public void setSumtargetqty(BigDecimal sumtargetqty) {
        this.sumtargetqty = sumtargetqty;
    }

    public BigDecimal getSumgoalrate() {
        return sumgoalrate;
    }

    public void setSumgoalrate(BigDecimal sumgoalrate) {
        this.sumgoalrate = sumgoalrate;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Short getUsercount() {
        return usercount;
    }

    public void setUsercount(Short usercount) {
        this.usercount = usercount;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getLogouttime() {
        return logouttime;
    }

    public void setLogouttime(Date logouttime) {
        this.logouttime = logouttime;
    }

    public BigDecimal getLogoutexceptiontime() {
        return logoutexceptiontime;
    }

    public void setLogoutexceptiontime(BigDecimal logoutexceptiontime) {
        this.logoutexceptiontime = logoutexceptiontime;
    }

    public BigDecimal getSetuptime() {
        return setuptime;
    }

    public void setSetuptime(BigDecimal setuptime) {
        this.setuptime = setuptime;
    }

    public BigDecimal getStdsetuptime() {
        return stdsetuptime;
    }

    public void setStdsetuptime(BigDecimal stdsetuptime) {
        this.stdsetuptime = stdsetuptime;
    }
}