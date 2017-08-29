package com.drive.service.entity;

/**
 * Created by jiangtingfeng on 2017/8/23.
 */
public class User
{
    private Integer userId;

    private String userName;

    private Integer age;


    public User(String userName,Integer age)
    {
        this.age = age;
        this.userName = userName;
    }

    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "User{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", age='" + age + '\'' +
            '}';
    }
}
