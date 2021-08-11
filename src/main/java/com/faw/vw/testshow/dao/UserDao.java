package com.faw.vw.testshow.dao;

import com.faw.vw.testshow.domain.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.swing.*;

// Dao 必须使用 @Mappger注解，才能实现从Dao到Mapper.xml的映射
@Mapper
public interface UserDao {

    //用户登录
    //int login(String userName,String password) ;
    //int login(@Param("userName")String userName,@Param("password")String password) ;
    UserDo getAll(String userName, String password) ;
    //查询用户信息
    int getUserId(String userName, String password);
}
