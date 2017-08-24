package com.drive.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jiangtingfeng on 2017/8/24.
 */
@SpringBootApplication
@MapperScan(value ="*.mapper")
public class ServerStart
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(ServerStart.class, args);
    }
}
