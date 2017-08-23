package com.drive.service.dao;

/**
 * Created by jiangtingfeng on 2017/8/23.
 */
public class User
{
    private int userId;

    private String userName;

    private int age;


    public User(String userName,int age)
    {
        this.age = age;
        this.userName = userName;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
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

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
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
