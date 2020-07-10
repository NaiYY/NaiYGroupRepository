package com.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Date;

@TableName("hotel_operator")
public class HotelOperator {

    private String opeUsername;
    private String opePassword;
    private Integer opePrivilege;
    private String opeAddress;
    private String opeName;
    private String opeTelephone;
    private String opeMobile;
    private String opeZip;
    private Date opeCreateTime;

    public String getOpeUsername() {
        return opeUsername;
    }

    public void setOpeUsername(String opeUsername) {
        this.opeUsername = opeUsername;
    }

    public String getOpePassword() {
        return opePassword;
    }

    public void setOpePassword(String opePassword) {
        this.opePassword = opePassword;
    }

    public Integer getOpePrivilege() {
        return opePrivilege;
    }

    public void setOpePrivilege(Integer opePrivilege) {
        this.opePrivilege = opePrivilege;
    }

    public String getOpeAddress() {
        return opeAddress;
    }

    public void setOpeAddress(String opeAddress) {
        this.opeAddress = opeAddress;
    }

    public String getOpeName() {
        return opeName;
    }

    public void setOpeName(String opeName) {
        this.opeName = opeName;
    }

    public String getOpeTelephone() {
        return opeTelephone;
    }

    public void setOpeTelephone(String opeTelephone) {
        this.opeTelephone = opeTelephone;
    }

    public String getOpeMobile() {
        return opeMobile;
    }

    public void setOpeMobile(String opeMobile) {
        this.opeMobile = opeMobile;
    }

    public String getOpeZip() {
        return opeZip;
    }

    public void setOpeZip(String opeZip) {
        this.opeZip = opeZip;
    }

    public Date getOpeCreateTime() {
        return opeCreateTime;
    }

    public void setOpeCreateTime(Date opeCreateTime) {
        this.opeCreateTime = opeCreateTime;
    }

}