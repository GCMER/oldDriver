package com.drive.service.entity;

/**
 * Created by jiangtingfeng on 2017/8/23.
 */
public class User
{
    private int userId;

    private String name;

    private int age;


    public User()
    {

    }

    public User(String userName,int age)
    {
        this.age = age;
        this.name = userName;
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
        return name;
    }

    public void setUserName(String userName)
    {
        this.name = userName;
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
            ", userName='" + name + '\'' +
            ", age='" + age + '\'' +
            '}';
    }
}
