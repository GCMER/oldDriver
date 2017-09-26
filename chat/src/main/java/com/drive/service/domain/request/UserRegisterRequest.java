package com.drive.service.domain.request;

import com.drive.service.repository.entity.AccountInfo;

public class UserRegisterRequest extends Request{
    private AccountInfo accountInfo;

    public AccountInfo getAccountInfo() {
        return accountInfo;
    }
    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }
}
