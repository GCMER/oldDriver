package com.drive.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangtingfeng on 2017/9/5.
 */
@Controller
public class indexController
{

    @Value("${name:BigBoss}")
    private String name;

    @Value("${project:欢迎视察几个亿的大项目}")
    private String project;

    @RequestMapping("/")
    public String index(ModelMap mode)
    {
        mode.addAttribute("name",name);
        mode.addAttribute("project",project);
        return "index";
    }
}
