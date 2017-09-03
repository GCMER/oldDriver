package com.drive.service.repository.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class IdentityInfo {

	private String identityID;

	@JSONField(format = "yyyyMMddHHmmss")
	private Date createTime;

	@JSONField(format = "yyyyMMddHHmmss")
	private Date updateTime;

	public String getIdentityID() {
		return identityID;
	}

	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
