package com.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 *  Created by shao.guangze on 2019/11/26
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/userInfo")
    public String  testMetod(){
        System.out.println("可以访问userInfo");
        return "success";

    }
}
