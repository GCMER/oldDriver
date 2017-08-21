package com.drive.service.dao;

import com.drive.service.dao.entity.Identity;

public interface IUserIdentityDao {
	public void createIdentity(Identity identity);
	public void deleteIdentity(Identity identity);
	public void updateIdentity(Identity identity);
	public Identity getIdentity(String identityID);
}
