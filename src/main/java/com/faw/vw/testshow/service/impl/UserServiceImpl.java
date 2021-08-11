package com.faw.vw.testshow.service.impl;

import com.faw.vw.testshow.dao.UserDao;
import com.faw.vw.testshow.domain.UserDo;
import com.faw.vw.testshow.result.Result;
import com.faw.vw.testshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Result login(String userName, String password) {
        int userId= userDao.getUserId(userName,password);
        if (0== userId  || "null"== Integer.toString(userId) || userId <= 0){
           System.out.println("【账号密码错误，请重新输入账号密码】");
            return new Result(400);
        } else {
           System.out.println("【登录成功！！】");
            return new Result(200);
        }
    }

    @Override
    public int getUserId(String userName,String password) {
        System.out.println("该用户数据的id是："+userDao.getUserId(userName,password));
        return  userDao.getUserId(userName,password);
    }
}
