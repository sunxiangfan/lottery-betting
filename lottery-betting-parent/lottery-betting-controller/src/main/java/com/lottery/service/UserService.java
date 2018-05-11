package com.lottery.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.lottery.entity.UserInfoBean;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Reference(version = "1.0.0")
    UserInfoService userInfoService;

    public UserInfoBean findUserInfoById(String id) {
        return userInfoService.findUserInfoById(id);
    }
}