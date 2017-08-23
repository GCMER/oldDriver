package com.drive.service.interfaces;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drive.service.repository.dao.UserIdentityDao;
import com.drive.service.repository.entity.IdentityInfo;

/**
 * Created by jiangtingfeng on 2017/8/21.
 */

@SpringBootApplication
@MapperScan(value ="com.drive.service.dao")
public class HelloWorld
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(HelloWorld.class, args);
    }
}
