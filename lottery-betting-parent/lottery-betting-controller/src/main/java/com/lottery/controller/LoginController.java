package com.lottery.controller;

import com.lottery.service.SayHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    SayHiService sayHiService;

    @RequestMapping("/hello")
    public String greeting() {
        return sayHiService.sayHi();
    }
}
