package com.drive.service.interfaces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiangtingfeng on 2017/8/21.
 */

@Controller
@EnableAutoConfiguration
public class HelloWorld
{
    @RequestMapping("/")
    @ResponseBody
    String home()
    {
        return "Hello World ! 几个亿的项目启动了，颤抖吧。。。。。。";
    }

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(HelloWorld.class, args);
    }
}
