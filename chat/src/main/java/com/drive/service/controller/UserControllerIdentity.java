package com.drive.service.controller;

import com.drive.service.generator.IDGeneratorEnum;
import com.drive.service.generator.IDGeneratorFactory;
import com.drive.service.repository.dao.IdentityDao;
import com.drive.service.repository.entity.IdentityInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by jiangtingfeng on 2017/8/23.
 */
@RestController
public class UserControllerIdentity
{
    @Autowired
    private IdentityDao userIdentityDao;

    @Autowired
    @Qualifier("idGeneratorFactory")
    private IDGeneratorFactory generator;

    @RequestMapping(value = "/getIdentity", method = RequestMethod.GET)
    public IdentityInfo getAccountByIdentityID(@RequestParam("id") String identityID)
    {
        IdentityInfo identityInfo = null;
        if(null != identityID && identityID.trim().length()>0)
        {
            identityInfo = userIdentityDao.getIdentity(identityID);
        }
        return identityInfo;
    }

    @RequestMapping(value = "/createIdentity",method = RequestMethod.GET)
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

    @RequestMapping(value = "/deleteIdentity",method = RequestMethod.GET)
    public String deleteAccount(@RequestParam("id") String identityID)
    {
        IdentityInfo identity = new IdentityInfo();
        identity.setIdentityID(identityID);
        userIdentityDao.deleteIdentity(identity);
        return "删除账号成功！";
    }

    @RequestMapping(value = "/createIdentityByJson")
    @ResponseBody
    public IdentityInfo createIdentityByJson(@RequestBody IdentityInfo identityInfo)
    {
        String identityID = generator.get(IDGeneratorEnum.IDENTITY).generate();
        identityInfo.setIdentityID(identityID);
        userIdentityDao.createIdentity(identityInfo);
        return identityInfo;
    }

}
