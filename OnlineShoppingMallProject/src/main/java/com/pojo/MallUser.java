package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;

@TableName("mall_user")
public class MallUser {
    @TableId(type = IdType.AUTO)
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userRealName;
    private String userSex;
    private String userAddress;
    private String userPhone;
    private String userPost;
    private String userEmail;
    private Timestamp userRegTime;
    private String userRegIpAddress;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Timestamp getUserRegTime() {
        return userRegTime;
    }

    public void setUserRegTime(Timestamp userRegTime) {
        this.userRegTime = userRegTime;
    }

    public String getUserRegIpAddress() {
        return userRegIpAddress;
    }

    public void setUserRegIpAddress(String userRegIpAddress) {
        this.userRegIpAddress = userRegIpAddress;
    }

    @Override
    public String toString() {
        return "MallUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRealName='" + userRealName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userPost='" + userPost + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userRegTime=" + userRegTime +
                ", userRegIpAddress='" + userRegIpAddress + '\'' +
                '}';
    }
}