package com.lottery.service;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class SayHiService {

    @Reference(version="1.0.0")
    DemoService demoService;
      
    public String sayHi(){  
        return demoService.SayHi("consumer");
    }  
}  