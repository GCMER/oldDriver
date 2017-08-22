package com.drive.service.dao;

import com.drive.service.dao.entity.IdentityInfo;

@org.springframework.stereotype.Repository
public interface UserIdentityDao {
	public void createIdentity(IdentityInfo identity);
	public void deleteIdentity(IdentityInfo identity);
	public void updateIdentity(IdentityInfo identity);
	public IdentityInfo getIdentity(Integer identityID);
}
