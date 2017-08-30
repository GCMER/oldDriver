package com.drive.service.controller;

import com.drive.service.generator.IDGeneratorEnum;
import com.drive.service.generator.IDGeneratorFactory;
import com.drive.service.repository.dao.IdentityDao;
import com.drive.service.repository.entity.IdentityInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by jiangtingfeng on 2017/8/23.
 */
@RestController
public class UserControllerIdentity
{
    @Autowired
    private IdentityDao userIdentityDao;

    @Autowired
    @Qualifier("idGengeratorFactory")
    private IDGeneratorFactory generator;

    @RequestMapping(value = "/getAccount", method = RequestMethod.GET)
    public String getAccountByIdentityID(@RequestParam("id") Integer identityID)
    {
        IdentityInfo identityInfo = null;
        if(null != identityID && identityID != 0)
        {
            identityInfo = userIdentityDao.getIdentity(identityID);
        }
        return identityInfo==null?"null":identityInfo.getIdentityID();
    }

    @RequestMapping(value = "/createAccount",method = RequestMethod.GET)
    public String createAccount()
    {
        String identityID = generator.get(IDGeneratorEnum.IDENTITY).generate();
        IdentityInfo identity = new IdentityInfo();
        identity.setIdentityID(identityID);
        identity.setCreateTime(new Date());
        identity.setUpdateTime(new Date());
        userIdentityDao.createIdentity(identity);
        return "success";
    }

    @RequestMapping(value = "/deleteAccount",method = RequestMethod.GET)
    public String deleteAccount(@RequestParam("id") String identityID)
    {
        IdentityInfo identity = new IdentityInfo();
        identity.setIdentityID(identityID);
        userIdentityDao.deleteIdentity(identity);
        return "删除账号成功！";
    }


}
