package com.drive.service.repository.dao;

import com.drive.service.repository.entity.AccountInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountInfoDao {
	void createAccount(AccountInfo accountInfo);

	void deleteAccount(String identityID);

	void updateAccount(AccountInfo accountInfo);

	AccountInfo getAccount(String identityID);
}
