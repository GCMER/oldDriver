package com.drive.service.domain.response;

import com.drive.service.repository.entity.AccountInfo;
import com.drive.service.repository.entity.IdentityInfo;

public class UserRegisterResponse extends Response{
    private IdentityInfo identityInfo;
    private AccountInfo accountInfo;

    public IdentityInfo getIdentityInfo() {
        return identityInfo;
    }

    public void setIdentityInfo(IdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
    }

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }
}
