package com.drive.service.controller;

import com.drive.service.repository.dao.AccountInfoDao;
import com.drive.service.repository.entity.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/createAccount",method = RequestMethod.GET)
    public String createAccount()
    {
        AccountInfo account = new AccountInfo();
        account.setIdentityID("123");
        account.setAccountName("1345535");
        account.setAccountType(1);
        account.setPassword("123456");
        account.setHeadImage("dafdasf");
        account.setLocation("571");
        account.setNickName("21");
        account.setSex(1);
        account.setSignature("43");
        accountInfoDao.createAccount(account);
        return "success";
    }

    @RequestMapping(value = "/deleteAccount",method = RequestMethod.GET)
    public String deleteAccount(@RequestParam("id") String identityID)
    {
        accountInfoDao.deleteAccount(identityID);
        return "删除账号成功！";
    }


}
