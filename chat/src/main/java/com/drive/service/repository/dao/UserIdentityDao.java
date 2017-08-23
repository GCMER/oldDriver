package com.drive.service.repository.dao;

import com.drive.service.repository.entity.IdentityInfo;


public interface UserIdentityDao {
	public void createIdentity(IdentityInfo identity);
	public void deleteIdentity(IdentityInfo identity);
	public void updateIdentity(IdentityInfo identity);
	public IdentityInfo getIdentity(Integer identityID);
}
