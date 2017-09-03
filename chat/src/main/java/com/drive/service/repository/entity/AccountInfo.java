package com.drive.service.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class AccountInfo {
    //身份ID，与IdentityInfo中的identityID关联
    private String identityID;

    //账号类型：1、手机号账号  2、邮箱账号
    private int accountType;

    //账号名：手机号或者邮箱
    private String accountName;

    //密码
    private String password;

    //昵称
    private String nickName;

    //性别:1、男 2、女 3、其他
    private int sex;

    //头像url
    private String headImage;

    //地区
    private String location;

    //个性签名
    private String signature;

    //最后更新时间
    @JSONField(format = "yyyyMMddHHmmss")
    private Date updateTime;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIdentityID() {
        return identityID;
    }

    public void setIdentityID(String identityID) {
        this.identityID = identityID;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "identityID='" + identityID + '\'' +
                ", accountType=" + accountType +
                ", accountName='" + accountName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", sex=" + sex +
                ", headImage='" + headImage + '\'' +
                ", location='" + location + '\'' +
                ", signature='" + signature + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
