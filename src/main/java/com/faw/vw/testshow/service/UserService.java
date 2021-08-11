package com.faw.vw.testshow.service;


import com.faw.vw.testshow.domain.UserDo;
import com.faw.vw.testshow.result.Result;


public interface UserService {
    //用户登录
    Result login(String userName, String password);

    //获取用户Id
    int getUserId(String userName,String password);
}
