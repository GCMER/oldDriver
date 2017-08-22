package com.drive.service.dao;

import com.drive.service.dao.entity.IdentityInfo;

public interface IUserIdentityDao {
	public void createIdentity(IdentityInfo identity);
	public void deleteIdentity(IdentityInfo identity);
	public void updateIdentity(IdentityInfo identity);
	public IdentityInfo getIdentity(String identityID);
}
