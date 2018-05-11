package com.lottery.controller;

import com.lottery.service.UserService;
import com.lottery.entity.UserInfoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public UserInfoBean findUserInfoById(UserInfoBean body) {
        UserInfoBean aa = userService.findUserInfoById(body.getId());
        return aa;
    }
}
