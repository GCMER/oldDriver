package com.drive.service.controller;

import com.drive.service.entity.User;
import com.drive.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jiangtingfeng on 2017/8/23.
 */
@RestController
public class UserController
{
    @Autowired
    private UserMapper userMapper;

    //-http://localhost:8080/getUser?id=1
    @RequestMapping(value = "/getUserName", method = RequestMethod.GET)
    public String getUserName(@RequestParam("id") Integer id)
    {
        String name = userMapper.getUserName(id);
        return "终于搞定了------------" + name;
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public List<User> getUsers()
    {
        return userMapper.getAll();
    }

    //-http://localhost:8080/add?name=abc&passwd=123&appid=95955542783
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void save(@RequestParam("name") String name,
        @RequestParam(value = "age", defaultValue = "0") int age)
    {
        userMapper.insert(new User(name, age));
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void delete(@PathVariable("id") Integer id)
    {
        userMapper.delete(id);
    }
}
