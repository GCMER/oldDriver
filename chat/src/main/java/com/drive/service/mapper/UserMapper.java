package com.drive.service.mapper;

import com.drive.service.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by jiangtingfeng on 2017/8/23.
 */

public interface UserMapper
{
    @Select("SELECT name FROM user WHERE userid =#{id}")
    String getUserName(Integer id);

    @Select("SELECT * FROM user")
    List<User> getAll();

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Integer id);

    @Insert("INSERT INTO user(name,age) VALUES(#{name}, #{age})")
    void insert(User user);
}
