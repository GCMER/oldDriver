package com.drive.service.redis;

import java.io.Serializable;

/**
 * Created by jiangtingfeng on 2017/9/29.
 */
public class RedisModel implements Serializable
{
    private String redisKey;//redis中的key

    private String name;//姓名

    private String tel;//电话

    private String address;//住址

    public String getRedisKey()
    {
        return redisKey;
    }

    public void setRedisKey(String redisKey)
    {
        this.redisKey = redisKey;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTel()
    {
        return tel;
    }

    public void setTel(String tel)
    {
        this.tel = tel;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
