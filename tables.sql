--创建身份id表
create table chat_user_identity(
	identityID integer not null,
    createTime date,
    updateTime date,
    primary key(identityID)
);
