package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Date;


@TableName("bbs_user_info")
public class BbsUserInfo {
    @TableId(type = IdType.AUTO)
    private Integer uId;
    private String uName;
    private String uPassword;
    private Boolean uSex;
    private String uFace;
    private Date uRegTime;
    private Integer uType;

    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public String getUPassword() {
        return uPassword;
    }

    public void setUPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Boolean getUSex() {
        return uSex;
    }

    public void setUSex(Boolean uSex) {
        this.uSex = uSex;
    }

    public String getUFace() {
        return uFace;
    }

    public void setUFace(String uFace) {
        this.uFace = uFace;
    }

    public Date getURegTime() {
        return uRegTime;
    }

    public void setURegTime(Date uRegTime) {
        this.uRegTime = uRegTime;
    }

    public Integer getUType() {
        return uType;
    }

    public void setUType(Integer uType) {
        this.uType = uType;
    }

    @Override
    public String toString() {
        return "BbsUserInfo{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uSex=" + uSex +
                ", uFace='" + uFace + '\'' +
                ", uRegTime=" + uRegTime +
                ", uType=" + uType +
                '}';
    }
}