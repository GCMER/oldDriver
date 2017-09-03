package com.drive.service.controller;

import com.drive.service.repository.dao.AccountInfoDao;
import com.drive.service.repository.entity.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jiangtingfeng on 2017/8/23.
 */
@RestController
public class UserControllerAccount
{
    @Autowired
    private AccountInfoDao accountInfoDao;

    @RequestMapping(value = "/getAccount", method = RequestMethod.GET)
    public String getAccountByIdentityID(@RequestParam("id") String identityID)
    {
        AccountInfo accountInfo = null;
        accountInfo = accountInfoDao.getAccount(identityID);
        return accountInfo==null?"null":accountInfo.getNickName();
    }

    @RequestMapping(value = "/createAccount",method = RequestMethod.POST)
    public AccountInfo createAccount(@RequestBody AccountInfo accountInfo)
    {
        accountInfoDao.createAccount(accountInfo);
        return accountInfo;
    }

    @RequestMapping(value = "/deleteAccount",method = RequestMethod.GET)
    public String deleteAccount(@RequestParam("id") String identityID)
    {
        accountInfoDao.deleteAccount(identityID);
        return "删除账号成功！";
    }
}
