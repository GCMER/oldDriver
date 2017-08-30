package com.drive.service.repository.dao;

import com.drive.service.repository.entity.IdentityInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface IdentityDao {
	@Insert("INSERT INTO chat_user_identity(identityID,createTime,updateTime) VALUES(#{identityID}, #{createTime},#{updateTime})")
	void createIdentity(IdentityInfo identity);

	@Delete("DELETE FROM chat_user_identity WHERE identityID = #{identityID}")
	void deleteIdentity(IdentityInfo identity);

	@Update("UPDATE chat_user_identity set updateTime=sysdate() WHERE identityID=#{identityID}")
	void updateIdentity(IdentityInfo identity);

	@Select("SELECT * FROM chat_user_identity WHERE identityID = #{identityID}")
	IdentityInfo getIdentity(Integer identityID);
}
