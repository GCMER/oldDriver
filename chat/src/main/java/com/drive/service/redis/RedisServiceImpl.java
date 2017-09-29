package com.drive.service.redis;

import org.springframework.stereotype.Service;

/**
 * Created by jiangtingfeng on 2017/9/29.
 */
@Service
public class RedisServiceImpl extends RedisService<RedisModel>
{
    private static final String REDIS_KEY = "TEST_REDIS_KEY";

    @Override
    protected String getRedisKey()
    {
        return this.REDIS_KEY;
    }
}
