package com.faw.vw.testshow.controller;

import com.faw.vw.testshow.domain.UserDo;
import com.faw.vw.testshow.result.Result;
import com.faw.vw.testshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import javax.annotation.Resource;
import java.util.Objects;


/**
 * post 请求
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public Result login(@RequestBody UserDo userDo) {
        String userName = userDo.getUserName();
        String password = userDo.getPassword();
        return userService.login(userName,password);
    }

    @CrossOrigin //跨域注解
    @RequestMapping(value = "/login1", method=RequestMethod.GET)
    public Result login2(@RequestParam("userName") String userName,@RequestParam("password") String password){
        return userService.login(userName,password);
        }
}
